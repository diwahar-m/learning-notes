public class LinearSearch{
    public static void main(String[] args){
        int[] nums = {5, 7, 9, 11, 13};
        int target = 11;

        int result = linearSearch(nums, target);
        // int result = binarySearch(nums, target, 0, nums.length-1)

        if(result != -1){
            System.out.println("Element found at Index: "+ result);

        }else {
            System.out.println("Element not found");
        }
    } 

    public static int linearSearch(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right){
        

        // ---- METHOD -1 ------
        // 5, 7, 9, 11, 13 
        // int left = 0; 
        // int right = nums.length-1;

        // while(left <= right){
        //     int mid = (left + right)/2;

        //     if(nums[mid] == target){
        //         return mid;
        //     }
        //     else if(nums[mid] < target){
        //         left = mid +1;
        //     }else {
        //         right = mid -1;
        //     }
        // } 

        // ---- METHOD -2 ------ 

        if(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                return binarySearch(nums, target, mid+1, right);
            }else 
                return binarySearch(nums, target, left, mid-1);
        }
        return -1;
    }
}