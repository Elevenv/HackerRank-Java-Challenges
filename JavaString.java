// The elements of a String are called characters. The number of characters in a String is called the length,
//  and it can be retrieved with the String.length() method.

import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len = A.length()+B.length();
        int compare = A.compareTo(B);
        System.out.println(len);    
        if(compare>0){
            System.out.println("Yes");
        }    
        else{
            System.out.println("No");
        }
        String firstLetter = A.substring(0,1);
        String RemLetters = A.substring(1,A.length());
        firstLetter = firstLetter.toUpperCase();
        A = firstLetter + RemLetters;
        String firstLetter1 = B.substring(0,1);
        String RemLetters1 = B.substring(1,B.length());
        firstLetter1 = firstLetter1.toUpperCase();
        B = firstLetter1 + RemLetters1;
        System.out.println(A+" "+B);
    }
}