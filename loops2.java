// The first line contains an integer,q , denoting the number of queries.
// Each line i of the q subsequent lines contains three space-separated integers describing the respective ai,bi,ni values for that query.


import java.util.*;
class Solution {
    public static void main(String[] args) {
        int n,i,j;
        int a,b,c;
        int arr[] = new int[20];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int l=0;l<n;l++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int sum;
            sum = 0;
            i = 0;
            j = 2;
            while(i<c){
                if(i==0){
                    sum = a+b;
                    arr[i] = sum;
                }
                else{
                    sum = sum + j*b;
                    arr[i] = sum;
                    j = j*2;
                }  
                i++;            
            }   
            for(int k=0;k<c;k++)
                System.out.print(arr[k]+" ");
            System.out.println();
        }
    sc.close();
    }
}
