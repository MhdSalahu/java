import java.util.Scanner;
public class baseConversion{
	static void binary(int num)
	{
		int[] bin =new int[20];
		int i=0;
		while(num != 0)
		{
			bin[i++] =num%2;
			num/=2;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(bin[j]);
		}
	}

	static void octal(int num)
	{
		int[] bin =new int[20];
		int i=0;
		while(num != 0)
		{
			bin[i++] =num%8;
			num/=8;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(bin[j]);
		}
	}

	static void hexaDecimal(int num)
	{
		String[] bin =new String[20];
		int i=0;
		while(num != 0)
		{
			int rem =num%16;
			if(rem>9)
			{
				switch(rem)
				{
					case 10:bin[i++]="A";
							break;
					case 11:bin[i++]="B";
							break;
					case 12:bin[i++]="C";
							break;
					case 13:bin[i++]="D";
							break;
					case 14:bin[i++]="E";
							break;
					case 15:bin[i++]="F";
							break;
				}	
				num/=16;
			}
			else
			{	
				bin[i++] =Integer.toString( num%16);	
				num/=16;	
			}	
			
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(bin[j]);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		System.out.println("Entered number is "+ number);
		System.out.print("Binary : ");
		binary(number);
		System.out.print("    Octal : ");
		octal(number);
		System.out.print("    Hexadecimal : ");
		hexaDecimal(number);
	}

}