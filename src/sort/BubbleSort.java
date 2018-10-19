package sort;

public class BubbleSort {
    public static void main(String[] args){
        int[] values={11,8,3,9,7,1,2,5};
        bubbleSort(values,values.length);
        for(int i=0;i<values.length;i++){
            System.out.print(values[i]);

        }

    }
    public static void bubbleSort(int a[],int n){
        if(n<=1){
            return;
        }
        for(int i=0;i<n;++i){
            boolean flag = false;
            for(int j=0;j<n-i-1;++j){
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
