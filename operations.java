import java.util.Scanner;

public class operations {
     Scanner sc = new Scanner(System.in);
    public int addition(){
        int answ =0;
         int c ,n;
         System.out.println("\n how many numbers you want add ");
        c=sc.nextInt();   
        for(int i =1;i<=c;i++){
            if(i==1){
                 System.out.println("Enter "+ i+"st number =" );
                 n=sc.nextInt();
            }else if (i==2){
                 System.out.println("Enter "+ i+"nd number =" );
                 n=sc.nextInt();
            }else if(i==3){
                System.out.println("Enter "+ i+"rd number =" );
                n=sc.nextInt();
            }else{
            System.out.println("Enter "+ i +"th number =" );
            n =sc.nextInt();
            }
            answ= answ+n;
        }
             System.out.println("addition of above numbers is ="+ answ);
             return answ ;
            }
           
     public int subtraction(){
         int answ =0;
         int n=0;
         int c ;
         System.out.println("\n how many numbers you want subtract ");
        c=sc.nextInt();   
        for(int i =1;i<=c;i++){
            if(i==1){
                 System.out.println("Enter "+ i+"st number =" );
                 answ=sc.nextInt();
                    
            }else if (i==2){
                 System.out.println("Enter "+ i+"nd number =" );
                 n=sc.nextInt();
            }else if(i==3){
                System.out.println("Enter "+ i+"rd number =" );
                n=sc.nextInt();
            }else{
            System.out.println("Enter "+ i +"th number =" );
            n =sc.nextInt();
            }
            if (n>=0){
            answ=answ-n;
            }else{
                answ=answ+n;
            }

        }
             System.out.println("subtraction of above numbers is = "+ answ);
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

