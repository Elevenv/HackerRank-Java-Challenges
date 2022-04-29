
// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.


import java.util.*;

class Solution {

    static boolean CheckPal(String str){
        int i=0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        if(CheckPal(str))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}