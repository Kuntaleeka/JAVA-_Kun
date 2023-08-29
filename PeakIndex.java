import java.util.*;
class PeakIndex
{
static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
     return start;
    }

public static void main(String[] args)
{
    Scanner in=new Scanner(System.in);
    System.out.println("Input enter the size of the array:");
    int n=in.nextInt();
    int [] arr=new int[n];

    System.out.println("Input enter the array elements:");
    for(int i=0;i<n;i++)
    arr[i]=in.nextInt();

    int gg=peakIndexInMountainArray(arr);
    System.out.println("Peak Index:" +gg);
}
}