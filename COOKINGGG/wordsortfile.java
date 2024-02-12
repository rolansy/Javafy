import java.io.*;

public class wordsortfile {
    public static void main(String[] args)throws Exception{
        BufferedReader r=new BufferedReader(new FileReader("D:/Java OOP/LABEXAM/tbc.txt"));

        String l;
        String []a= new String[100];
        int x=0;
        do{
            l=r.readLine();
            if (l!=null){
                String []w=l.split(" ");
                for(int i=0;i<w.length;i++){
                    if (w[i]!=null){
                        a[x++]=w[i];
                    }
                    
                }
            }
            
        }while(l!=null);

        System.out.println("\nBefore Sorting Words : ");
        for (int i=0; i<x-1;i++){
            System.out.print(a[i]+" ");
        }
        // String[] s=new String[100];
        for(int i=0;i<x-1;i++){
            for(int j=0;j<x-1-i;j++){
                if ((a[j].compareToIgnoreCase(a[j+1]))>0){
                    String t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("\n\nSorted Words Are : ");
        for (int i=0; i<x;i++){
            System.out.print(a[i]+" ");
        }
        r.close();

    }
    
}
