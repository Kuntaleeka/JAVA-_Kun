class InfiniteArray 
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
{
    static int ans(int []arr,int key)
    {
        // first find the range
        // first start with a box of size 2
        int start=0;
        int end=1;
        if(key>arr[end])
        {
            int newstart=end+1;
             // double the box value
            // end = previous end + sizeofbox*2
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return binarySearch(arr, key, start, end);
    }




    static int binarySearch(int[] arr,int key,int start,int end)
    {
        while(start<=end)
        {
            int mid= start +(end-start)/2;
            if(key<arr[mid])
            {
                end=mid-1;
            }
            else if(key>arr[mid])
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
    public static void main(String[] args)
    {
        int[] arr ={2,3,5,33,34,52,55,76};
        int key=52;
        System.out.println(ans(arr,key));
    }
    }
    

