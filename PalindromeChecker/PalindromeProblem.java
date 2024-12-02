package PalindromeChecker;

import java.util.Scanner;

public class PalindromeProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();

        str = str.replaceAll("[^a-zA-Z]", "");
        int start=0;
        int end=str.length()-1;

        boolean flag=true;
      
        while(end>start){
            if(str.charAt(end) != str.charAt(start)){
                flag=false;
                break;
            }
            start++;
            end--;
        }
        if(flag){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    } 

}
