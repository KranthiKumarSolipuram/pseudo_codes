package SortingAlgorithm;

public class InsertSort {
    public static void main(String[] args) {
        int arr[]={4,2,3,6,2,8};

        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }

            arr[j+1]=key;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
