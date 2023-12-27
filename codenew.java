
import java.util.*;

public class codenew {
    operations call =new operations();
    public void newcalculator (){
    
		int ch;
		Scanner sc = new Scanner(System.in);
        System.out.println("\n What you want to perform ");
		System.out.println("\n 1 for addition \n 2 for subtrction \n 3 for multiplication \n 4 dividation \n 5 for mod ");
		System.out.println("\n enter your choise ");
		ch=sc.nextInt();
		// System.out.println("\n enter a number ");
		// a=sc.nextInt();
		// System.out.println("\n enter second number ");
		// b=sc.nextInt();
		// System.out.println("\n enter your choise ");
		// System.out.println("\n 1 for addition \n 2 for subtrction \n 3 for multiplication \n 4 dividation \n 5 for mod ");
		// ch=sc.nextInt();
		

		switch(ch)
		{
			case 1: call.addition();
			break;
			case 2:call.subtraction();
			break;
			// case 3:call.multiplication(a, b);
 			// break;
 			// case 4:call.division(a, b);
			// break;
			// case 5:call.mod(a, b);
			// break;
		}
    }
 
    public static void main(String[] args) {
        codenew obj =new codenew();
        obj.newcalculator();
    }
}
       