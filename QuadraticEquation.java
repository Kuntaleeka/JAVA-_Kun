package ClassX;

import java.util.Scanner;
class QuadraticEquation
{
    public void qSolve(double a, double b, double c)
    {
        double r1;
        double r2;
        //By Sridharacharya's Method
        r1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println("The Roots are: " + r1 + " , " + r2);
    }
    
    public static void main(String args[])
    {
        QuadraticEquation ob = new QuadraticEquation();
        Scanner sc = new Scanner(System.in);
        System.out.println("If Equation is ax2 + bx + c");
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();
        ob.qSolve(a, b, c);
    }
}
    