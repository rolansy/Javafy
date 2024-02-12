import java.util.*;

class randn extends Thread{
    static int x;
    synchronized public void run(){
        Random rn=new Random();
        x=rn.nextInt(25);
        System.out.println("\nRandom Integer : "+x);

    }

}


class fib extends Thread{
    

    synchronized public void run(){
        if(randn.x%2==0){
            int a=0;
            int b=1;
            System.out.print("\nFibonacci Sequence of "+randn.x+" terms : ");
            for(int j=0;j<randn.x;j++){
                int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
            System.out.println("");

        }

    }

}

class notfib extends Thread{
    

    synchronized public void run(){
        if(randn.x%2!=0){
            char a='+';
            char b='*';
            char t;
            System.out.print("\nAlternating + * Sequence of "+randn.x+" terms : ");
            for(int j=0;j<randn.x;j++){
                t=a;
                System.out.print(t+" ");
                a=b;
                b=t;
            }
            System.out.println("");

        }

    }

} 



public class multthreadfibonacc {
    synchronized public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number Of terms : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            Thread t1=new Thread(new randn());
            Thread t2=new Thread(new fib());
            Thread t3=new Thread(new notfib());
            
            try{
                Thread.sleep(1000);
            } catch(Exception e) {}

            t1.run();
            t2.run();
            t3.run();
        
        }



    }
}
