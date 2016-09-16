import java.util.Scanner;

//http://codeforces.com/problemset/problem/270/A

public class FancyFence {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        for (int i = 0; i < n; i++) {
            int x = reader.nextInt();
            double valid = 360.0 / (180.0 - x);
            if (valid == (int) valid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
