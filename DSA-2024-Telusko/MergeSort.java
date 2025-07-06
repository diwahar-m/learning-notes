public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r){
        if(l< r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);

        }
        
    }

    public static void merge(int[] arr, int l, int mid, int r){

        int n1=mid-l+1;
        int n2=r-mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];


        for(int x=0;x<n1;x++){
            lArr[x] = arr[l+x];
        }

        for(int x=0;x<n2;x++){
            rArr[x] = arr[mid+x];
        }

        int i=0;
        int j=0;
        int k=l;

        // comparing left & right arrayv
        while(i<n1 && j <n2){
            if(lArr[i] < rArr[j]){
                arr[k] = lArr[i];
                i++;
            }else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        } 

        // left over in left & 

    }

    public static void main(String[] args) {
        int[] arr = {3, 9, 8,7,6,5,4,2,1};
        int l = 0;
        int r = arr.length-1;
        mergeSort(arr,l,r);
    }
}
