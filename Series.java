package ClassX;

//program 2
//find the sum of the following series
//1 - (x^2)/2! + (x^4)/4! _ (x^6)/6!
import java.util.Scanner;
class Series
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Series ob = new Series();
        System.out.print("Enter the number: ");
        int x = sc.nextInt();// taking input the value of x
        System.out.print("Enter no of terms: ");
        int n = sc.nextInt();// taking input the no. of terms
        double s = 1;// for calculating sum
        for(int i = 1;i<=n;i++)// loop for calculating sum
        {
            if(i%2 == 1)
             s = s - Math.pow(x,2*i)/ob.fact(2*i);// odd term(by loop)
            else
             s = s + Math.pow(x,2*i)/ob.fact(2*i);//even term(by loop)
        }
        System.out.println("The Sum of " + n + " terms is " + s);
    }
    
    public int fact(int n)
    {//calculating factorial of a number
        int f=1;
            for(int i = 1;i <= n; i++)
            {
                f*=i;
            }
        return f;
    }
}