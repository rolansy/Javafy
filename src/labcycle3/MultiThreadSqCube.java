package labcycle3;

import java.util.Random;
import java.util.Scanner;

class RandN implements Runnable {
    static int random;
    Random rand = new Random();

    public void run() {
        random = rand.nextInt(25);
        System.out.println("Random Number : "+random);
    }
}

class Even implements Runnable {
    public void run() {
        if (RandN.random % 2 == 0)
            System.out.println("Square : "+(int) Math.pow(RandN.random, 2) + "\n");
    }
}

class Odd implements Runnable {
    public void run() {
        if (RandN.random % 2 != 0)
            System.out.println("Cube : "+(int) Math.pow(RandN.random, 3) + "\n");
    }
}

class MultiThreadSqCube {
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter Limit : ");
    	int c=sc.nextInt();
        for (int i = 1; i < c+1; i++) {
            Thread t1 = new Thread(new RandN());
            Thread t2 = new Thread(new Even());
            Thread t3 = new Thread(new Odd());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            t1.run();
            t2.run();
            t3.run();
            sc.close();
        }
    }
}