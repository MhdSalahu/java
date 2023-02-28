import java.util.Scanner;

public class OddEvenThread implements Runnable {

    public static void main(String[] args) {
        int limit;

        // Scanner class object to read input values
        Scanner sc = new Scanner(System.in);

        //read limit from user
        System.out.print("Enter the limit : ");
        limit = sc.nextInt();
        
        // create two threads
        Thread t1 = new Thread(new OddRunnable(limit));
        Thread t2 = new Thread(new EvenRunnable(limit));

        // Start both threads
        t1.start();
        t2.start();
    }

}

class OddRunnable implements Runnable {
    int limit;

    public OddRunnable(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int even =2;even <= limit;even+=2) {
            System.out.println("Even thread : " + even);
        }
    }
}

class EvenRunnable implements Runnable {
    int limit;

    public EvenRunnable(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int odd=1;odd <= limit;odd+=2) {
            System.out.println("Odd thread : " + odd);
        }

    }
}