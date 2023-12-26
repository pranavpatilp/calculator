// # calculator
// my first code 
import java.util.*;

public class program
{
	public void calculator(){
		int num,num1,ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter a number ");
		num=sc.nextInt();
		System.out.println("\n enter second number ");
		num1=sc.nextInt();
		System.out.println("\n enter your choise ");
		System.out.println("\n 1 for addition \n 2 for subtrction \n 3 for multiplication \n 4 dividation \n 5 for mod ");
		ch=sc.nextInt();
		sc.close();
		switch(ch)
		{
			case 1: System.out.println("addition of "+ num +" and "+ num1 +" is "+(num+num1));
			break;
			case 2: System.out.println("subtraction of "+ num +" and "+ num1 +" is "+(num-num1));
			break;
			case 3: System.out.println("multiplication of "+ num +" and "+ num1 +" is "+(num*num1));
 			break;
 			case 4: System.out.println("dividation of "+ num +" and "+ num1 +" is "+(num/num1));
			break;
			case 5: System.out.println("mod of "+ num +" and "+ num1 +" is "+(num%num1));
			break;
		}

	}

    public static void main (String[] args)
	{
		program obj =new program();
		//Run program using creating object
		obj.calculator();		
	}
}
