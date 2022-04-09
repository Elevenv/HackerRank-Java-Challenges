// There are three lines of input:

// The first line contains an integer.
// The second line contains a double.
// The third line contains a String.
// Output Format

// There are three lines of output:

// On the first line, print String: followed by the unaltered String read from stdin.
// On the second line, print Double: followed by the unaltered double read from stdin.
// On the third line, print Int: followed by the unaltered integer read from stdin.


import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double dbl = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("String: "+str);
        System.out.println("Double: "+dbl);
        System.out.println("Int: "+i);
    }
}
