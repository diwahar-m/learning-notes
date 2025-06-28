
public class Sorting {
    public static void main(String[] args) {
        
        // ----- Bubble Sort -------
        int nums[] = {6, 5, 2, 8, 9, 4};
        int size= nums.length;
        int temp=0;

        for(int i=0; i<size;i++){
            for(int j=0;j<=size-i-1;j++){
                if(nums[j] > nums [j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        // ----------------
        
        // ----- Selection Sort ---- 
        int minIndex = -1;
        for(int i=0; i<size-1;i++){
            minIndex = i;
            for(int j=i+1; j< size; j++){
                if(nums[minIndex] > nums[j])
                    minIndex = j;
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        // ----- Insertion sort ----- 
        for(int i=1; i<nums.length; i++){
            int key = nums[i]; 
            int j = i-1;

            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
}
