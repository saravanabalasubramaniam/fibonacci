import java.io.*;
import java.util.*;
class Fibonacci
{
public static void main(String args[])
    {
    int a,sum,num1=0,num2=1;
    Scanner input=new Scanner(System.in);
    System.out.println("enter the limit:  ");
    a=input.nextInt();
    for(int i=0;i<=a;i++)
         {
         sum=num1+num2;
         num1=num2;
         num2=sum;
         System.out.println("the fibonacci series for"+a+"is:  "+sum);
         }
     }
}    
