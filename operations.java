import java.util.Scanner;

public class operations {
    
    public int addition(){
        Scanner sc = new Scanner(System.in);
        int answ =0;
         int c;
         System.out.println("\n how many numbers you want add ");
        c=sc.nextInt();   
        for(int i =0;i<c;i++){
            System.out.println("Enter "+ i +" number =" );
            int n =sc.nextInt();
            answ= answ+n;
        }   
        System.out.println("addition of above numbers is ="+ answ);
        return answ ;
    }

     public int subtraction(int a,int b){
        int answ = a-b;
        System.out.println("subtraction of "+ a +" and "+ b +" is "+(a-b));
        return answ;
    }
     public int multiplication(int a,int b){
        int answ = a*b;
        System.out.println("multiplication of "+ a +" and "+ b +" is "+(a*b));
        return answ;

    } public int division(int a,int b){
        int answ = a/b;
        System.out.println("division of "+ a +" and "+ b +" is "+(a/b));
        return answ;
        
    } public int mod(int a,int b){
        int answ = a%b;
        System.out.println("mod of "+ a +" and "+ b +" is "+(a%b));
        return answ;
    }
}

