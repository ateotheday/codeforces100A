//
/*
This one was tricky. Finding out the maximum and minimum of the input from the front and finding if any numbers greater or smaller than these exists isthe the problem, If it is found, we update the counter.
  import java.util.Scanner;
*/

public class m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sm=0, lg=0,count=0,idx=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(n==1){
            System.out.println(0);
            return;
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[i + 1]) {
                sm = arr[i];
                lg = arr[i + 1];
                idx=i+2;
                count++;
                break;
            } else if (arr[i] > arr[i + 1]) {
                sm = arr[i + 1];
                lg = arr[i]; //100
                idx=i+2; 
                count++;
                break;
            } 
            else {
                if(i+1==n-1)
                {
                    System.out.println(0);
                return;
                }
                continue;
            }
        }
        for (int i = idx; i < n; i++) {
            if (arr[i] > lg ) {
                lg = arr[i];
                count++;
            }
            else if (arr[i] < sm ) {
                sm = arr[i];
                count++;
            }
           
        }
         System.out.println(count);
    }
}
/*
This was my first approach, I made it overly complicated, i used an extra memory for an array for solving...which was unnecessary. A lot of edge cases arise. Each one was solved separate;y.
  */


//OPTIMAL APPROACH
/*
By aathirarn, contest: Codeforces Round 109 (Div. 2), problem: (A) I_love_\%username\%, Happy New Year!, #, Copy
  */
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int first = sc.nextInt();
        int min = first, max = first;
        int count = 0;
 
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            if (x > max) {
                max = x;
                count++;
            } else if (x < min) {
                min = x;
                count++;
            }
        }
 
        System.out.println(count);
    }
}
