import java.util.*;

class FirstAndLastPos {
    static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) 
        {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this funstion just returns the index valueof target
    static int search(int[] nums, int target, boolean findstartindex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findstartindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = in.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println("Enter the key:");
        int target = in.nextInt();

        int [] gg = searchRange(nums, target);
        System.out.println("Range: [" + gg[0] + ", " + gg[1] + "]");
    }
}