
//NEXT ROUND
/*In this problem, we have to find how many people would advance to the next level, if a particular person at the kth index would definitely pass the test.
  It is tricky to solve without using extra memory...but as in the problem, it is mentioned that the list is non-increasing, we can assume the index of the kth value to be 0 and then iterate through the input till we reach the kth index. So the count till the kth element will be added, then we check of the kth element is reached, if yes then increment the counter. after that alll the inputs are checked, if they are greater than or equal to the kth vallue and it is not equal to 0.
  */

import java.util.Scanner;

public class m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int k_val = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();

            if (i == k) {
                k_val = x;
            }

            if (x >=k_val&&x!=0) {
                 count++;
            }
        }

        System.out.println(count);
    }
}
