package ClassX;




//Program 9
/* Selection Sort
 * Sort the members of the array in ascending array
 */

import java.util.Scanner;//importing Scanner class for taking inputs within the program
class Selection_sort
{
    public static void main(String args[])
    {
        int i;// first loop variable
        int j;// nested loop variable
        int n;// for storing no.of variables
        int t;// fortemporary storing and adding no.s to array in required order
        int a[];// array variable
        Scanner sc = new Scanner(System.in);//creating Scanner class object 
        System.out.print("Enter the number of variables required: ");
        n = sc.nextInt();// taking input the no. of vatiables
        a = new int[n];// initializing array with no. of variables
        for( i = 0; i < n; i++)
        {
            System.out.print("Enter element no." + (i + 1) + ": ");
            a[i] = sc.nextInt();// taking input the variables in array 
        }
        for (i= 0; i < n - 1; i++)
        {
            int min = i; // taking minimal position as first one
            for(j = i + 1; j < n; j++)
               if(a[j] < a[min])
                  min = j;// if any element is smaller than min
            t = a[min];//swaping positions in array
            a[min] = a[i];
            a[i] = t;
        }
        System.out.println("The array in ascending order is:");
        for(i = 0; i < n; i++)// loop for printing the array
        
        {
            if(i > 0)
              System.out.print(", ");
            System.out.print(a[i]);
        }
    }
} 