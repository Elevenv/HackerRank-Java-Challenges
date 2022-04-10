// Read some unknown  lines of input from stdin(System.in) until you reach EOF; 
// each line of input contains a non-empty String.


import java.util.*;

class Solution {

    public static void main(String[] args) {
        int i;
        i = 1;
        Scanner sc = new Scanner(System.in);
        String str;
        while(sc.hasNext()){
            str = sc.nextLine();
            System.out.println(i+" "+str);
            i++;
        }
        sc.close();
    }
}