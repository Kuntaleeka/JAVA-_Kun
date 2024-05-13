package ClassX;

//program 5
//sorting elements of array using selection sort
import java.util.Scanner;
public class SelectionSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        SelectionSort ob = new SelectionSort();
        int arr[];// array variable
        int l;// for storing length of the array
        System.out.print("Enter the length of the array: ");
        l = sc.nextInt();// taking the input the length of the Array
         arr = new int[l];// initializing array
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < l; i++)
        {
            System.out.print("Enter the element no." + (i + 1) + " : ");
            arr[i] = sc.nextInt();// taking input the elements of the array
        }
        arr = ob.selSort(arr);// sorting array using function
        System.out.println("The Sorted array is: ");
        for(int i = 0; i < l; i++)
         System.out.print(arr[i] + " ");// displaying the elements of the array
    }
    
    public int[] selSort(int arr[])
    {//sorts the array in ascending order
        for(int i = 0; i < arr.length; i++)
        {int mp = i;
            for(int j = i + 1; j < arr.length; j++)
              if(arr[j] < arr[mp])
                mp = j;
         int t = arr[i];
         arr[i] = arr[mp];
         arr[mp] = t;
        }
        return arr;
    }
}