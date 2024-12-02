package BasicArrayManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int k=sc.nextInt();
        int arr[]=new int[k];

        System.out.println("Enter the Elements: ");
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[k-2]);

        sc.close();
    }
}
