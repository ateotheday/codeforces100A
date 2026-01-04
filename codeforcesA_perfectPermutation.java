
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.print(-1);
            return;
        }
        for (int i = 1; i < n; i += 2) {
            System.out.print(i + 1 + " " + i + " ");
        }
    }
}