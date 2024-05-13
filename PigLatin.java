package ClassX;

import java.util.Scanner;
class PigLatin
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i; 
        System.out.print("Enter the word to be translated: ");
        String str = sc.next().toUpperCase();
        for(i = 0; i <= str.length(); i++)
           {char ch = str.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I')
               break;
            }
        if( i == 0 )
           System.out.println(str);
        else if( i == str.length())
           System.out.println(str + "AY");
        else
           System.out.println(str.substring(i) + str.substring(0,i) + "AY");
    
        }
    }