// Input Format : Using Static Initialiazer block

// There are two lines of input. The first line contains : the breadth of the parallelogram. 
// The next line contains : the height of the parallelogram.

// Output Format

// If both values are greater than zero, then the main method must output the area of the parallelogram. 
// Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.



import java.util.*;
class Solution
{
	static int B,H;
	static {
    	Scanner sc = new Scanner(System.in);
    	B = sc.nextInt();
	    H = sc.nextInt();
        sc.close();
	}
    public static void main(String args[]){
        if(B<=0 || H<=0){
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
        else
            System.out.println(B*H);
    }
}