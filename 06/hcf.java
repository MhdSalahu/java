import java.util.Scanner;

class Main{
    static int hcf(int n1,int n2)
    {
        int rem =1;
        if(n1>n2)
        {
            while(rem!=0)
            {
                rem=n1 %n2;
                n1=n2;
                n2 = rem;
            }
            return n1;
        }
        else{
            while(rem!=0)
            {
                rem =n2%n1;
                n2=n1;
                n1=rem;
            }
            return n2;
        }
    }
    public static void main(String args[])
    {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int n1 = number.nextInt();
        int n2 = number.nextInt();
        System.out.println("HCF :" + hcf(n1,n2));
        System.out.println("LCM :" + (n1*n2)/hcf(n1,n2));

    }
}