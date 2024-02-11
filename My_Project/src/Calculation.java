import java.awt.desktop.SystemEventListener;

public class Calculation {
    int a; //Variable

    int b; //Variable
    void sum(int num1,int num2)
    {
        int result=num1+num2;
        System.out.println("The addition of two number is "+result);
    }
    void sub(int num1,int num2)

    {
        int result=num1-num2;
        System.out.println("The subtraction of two number is "+result);
    }
    void mul(int num1,int num2)
    {
        int result=num1*num2;
        System.out.println("The multiplication of two number is "+result);
    }
    void division(int num1,int num2)
    {
        int result=num1/num2;
        System.out.println("The division of two number "+result);


    }
}
