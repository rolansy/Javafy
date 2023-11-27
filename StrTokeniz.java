package OOPJPractice;

import java.util.*;
public class StrTokeniz {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String s=sc.nextLine();

        StringTokenizer st=new StringTokenizer(s," ");

        int sum=0;
        while(st.hasMoreTokens()){
            String str=st.nextToken();
            int n=Integer.parseInt(str);
            System.out.println(n);
            sum+=n;
        }
        System.out.print("Sum : "+sum);
        sc.close();
        
    }
    
}
