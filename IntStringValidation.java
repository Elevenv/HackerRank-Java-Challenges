// You are given an integer n, you have to convert it into a string.
// If your code successfully converts n into a string s
// the code will print "Good job". Otherwise it will print "Wrong answer".


import java.util.*;
class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str;
        str = Integer.toString(a);
        if(a == Integer.parseInt(str))
            System.out.println("Good job");
        else
            System.out.println("Wrong answer");
        sc.close();
    }
}