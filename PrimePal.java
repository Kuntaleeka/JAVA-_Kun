package ClassX;

//program 1
//find the palprime numbers within a range
import java.util.*;
class PrimePal
{
    public boolean isPrime(int n)
    {
        int c=0;// counting factors
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
            if(c==2)//if there are only two factors 
             return true;
            else 
             return false;
    }
    
    public boolean isPal(int n)
    {
        int t = n;// copy variable
        int m = 0;// for storing reverse of the number
        while (n!=0)
        {
           int d=n%10;//extracting digit
           m=m*10+d;// storing digit in reverse order
           n=n/10;
        }
        if(t==m)// if number equals reverse
         return true;
        else 
         return false;
    }    
    public static void main(String args[])
    {   
         PrimePal Ob=new PrimePal();
         Scanner  sc=new Scanner (System.in);
         int lb;// for lower bound
         int ub;// for upper bound
         boolean flag = false;// if no Palindrome number is found
         System.out.print("Enter the first limit: ");
         lb = sc.nextInt();// taking input the first limit
         System.out.print("Enter the second limit: ");
         ub = sc.nextInt();// taking input the second limit
         if(lb > ub)// swapping to reduce complexity of program
         {
             lb = lb + ub;
             ub = lb - ub;
             lb = lb - ub;
         }
         System.out.println("The Prime Palindrome number(s) are: ");
         for(int i = lb; i <= ub; i++)
         {
             if(Ob.isPrime(i) && Ob.isPal(i))// if n is Palindrome Prime
             {
                 System.out.println(i);
                 flag = true;
             }
         }
         if(flag == false)
          System.out.println("NONE");
    }
}