package samplequestions;
import java.util.*;
public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter String : ");
	String s=sc.nextLine();
	System.out.print("Enter character to be searched : ");
	String c=sc.nextLine();
	int f=0;
	for(int i=0;i<s.length();i++) {
		if(c.charAt(0)==s.charAt(i)) {
			f+=1;
		}
	}
	if (f>0) {
		System.out.print("Frequency of '"+c+"' in String is : "+f);
	}
	else {
		System.out.print("Character '"+c+"' not found");
	}
	
	
	
	}

}
