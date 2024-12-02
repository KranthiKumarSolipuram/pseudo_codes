package BasicArrayManipulation;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int k=sc.nextInt();
        int arr[]=new int[k];

        System.out.println("Enter the Elements: ");
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<k;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
