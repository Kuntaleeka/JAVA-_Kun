package ClassX;

import java.util.Scanner;
class Vertical_printing
{ 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        for(int i = 0; i < n.length(); i++)
           System.out.println(n.charAt(i));
        }
    }
        
        
