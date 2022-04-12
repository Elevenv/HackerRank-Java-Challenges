// Given a string,s,and two indices,start and end, print a substring consisting of 
// all characters in the inclusive range from  start to end-1 .

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start,end;
        start = sc.nextInt();
        end = sc.nextInt();
        System.out.println(str.substring(start,end));
        sc.close();
    }
}