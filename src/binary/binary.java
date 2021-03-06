package binary;

public class binary {
    public static void main(String[] args){
        int[] values={8,11,19,23,27,33,45,55,67,98};
        int index = binarySearch(values,values.length,98);
        System.out.println(index);

    }

    private static int  binarySearch(int a[],int n,int value){
        int low=0;
        int high=n-1;

        while (low<=high){
            int mid=(high+low)/2;
            if(a[mid]==value){
                return mid;
            }else if(a[mid]<value){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
