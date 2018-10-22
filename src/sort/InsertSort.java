package sort;

public class InsertSort {
    public static void main(String[] args){
        int[] values={11,8,3,9,7,1,2,5};
        insertSort(values,values.length);
        for(int i=0;i<values.length;i++){
            System.out.print(values[i]);

        }

    }
    public static void insertSort(int a[],int n){
        if(n<=1){
            return;
        }
        for(int i=1;i<n;i++){
            int value=a[i];
            int j=i-1;
            for(;j>=0;--j){
                if(a[j]>value){
                    a[j+1]=a[j];
                }else{
                    break;
                }
            }
            a[j+1]=value;
        }
    }
}
