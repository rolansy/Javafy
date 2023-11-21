package labcycle2;

import java.io.*;

public class FileCWLCount {

	public static void main(String[] args) throws Exception{
		try {
		// TODO Auto-generated method stub
			BufferedReader r=new BufferedReader (new FileReader("/home/oem/Ronal/Javafy/src/labcycle2/ftobecounted.txt"));
			
			int lc=0;
			int wc=0;
			int cc=0;
			String l;
			while((l=r.readLine()) != null) {
				lc++;
				String[] words=l.split(" ");
				wc+=words.length;
				cc+=l.length();
				
			}
			System.out.println("Number of Lines : "+lc);
			System.out.println("Number of Words : "+wc);
			System.out.println("Number of Characterse : "+cc);
		}
		catch (Exception e) {
			System.out.println("Error : "+e);
		}

	}

}
