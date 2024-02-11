import java.util.Scanner;

public class Calculator {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        Calculation obj=new Calculation();
        System.out.println("Enter two number");
        obj.a=sc.nextInt();
        obj.b=sc.nextInt();

        System.out.println("Enter the choice \n 1. Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        int choice=sc.nextInt();
        if(choice==1) {
            obj.sum(obj.a, obj.b);
        }
       else if(choice==2)
        {
            obj.sub(obj.a, obj.b);
        }
       else if(choice==3)
        {
            obj.mul(obj.a, obj.b);
        }
       else if(choice==4)
        {
            obj.division(obj.a, obj.b);
        }
       else {
           System.out.println("Invalid Option");
        }

    }

}
