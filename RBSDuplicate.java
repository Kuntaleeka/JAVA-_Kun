import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RBSDuplicate {
    
    static int search(int[] arr, int target)
    {
        int pivot=findPivot(arr);
          // if you did not find a pivot, it means the array is not rotated
        if(pivot == -1)
        {
            //perform normal binary search
            return binarySearch(arr,target,0,arr.length-1);
        }
         // if pivot is found, you have found 2 asc sorted arrays
         if(arr[pivot] == target)
         {
            return pivot;
         }
         if(target >= arr[0])
         {
            return binarySearch(arr, target, 0, pivot-1);
         }
        
         return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    
    static int binarySearch(int []arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid= start +(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int []arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start + (end-start)/2;
            if(mid < end && arr[mid]>arr[mid +1])
            {
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
             // if elements at middle, start, end are equal then just skip the duplicates
             if(arr[mid]==arr[start] && arr[mid]==arr[end])
             {
                // check if start is pivot
                if(start < end && arr[mid] > arr[start +1])
                {
                    return start;
                }
                start++;
                //check if end is pivot
                if(end > start && arr[mid] < arr[end-1])
                {
                    return end-1;
                }
                end--;
             }
             else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end])
             {
                start=mid+1;
             }
             else
             {
                end=mid-1;
             }
        }
      return -1;
    }
    public static void main(String args[])throws IOException
{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the size of the array:");
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the key:");
        int target = Integer.parseInt(br.readLine());

        int gg = search(arr, target);
        System.out.println(gg);
    }

}
