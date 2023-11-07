package labcycle2;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;


public class FileHandling {
    public static void main (String[] args ) throws IOException{    	
    try {
    	FileInputStream f1 = new FileInputStream("trial.txt");
    	FileOutputStream f2 = new FileOutputStream("Copy.txt");
    	int c=0;
    	do {
    	c=f1.read();
    	if (c!=-1) {
    		f2.write((char)c);
    	}
    	}while(c!=-1);
    }
}
