import java.util.*;

// http://codeforces.com/problemset/problem/489/C

public class GivenLengthAndSumOfDigits {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int m = reader.nextInt();
        int s = reader.nextInt();

        int[] smallest = new int[m];

        int[] biggest = new int[m];

        // this is stupid because it's a very special case that I didn't know until submitting the code
        if (s == 0 && m == 1) {
            System.out.println("0 0");
            return;
        }

        // these are the non possible inputs
        if (s < 1 || s > 9 * m) {
            System.out.println("-1 -1");
            return;
        }

        // it's easy fill nines from right for the small number and from left for the big one
        int i = 0;
        while (s != 0) {
            int add;
            if (s >= 9) {
                add = 9;
                s -= 9;
            } else {
                add = s;
                s -= s;
            }
            biggest[i] += add;
            smallest[m-i-1] += add;
            i++;
        }

        // for the small number remove one from the biggest number and add it to the leftmost zero
        // to leave no leading zeros as the problem states
        smallest[m-i] -= 1;
        smallest[0] += 1;

        Arrays.stream(smallest).forEach(System.out::print);
        System.out.print(" ");
        Arrays.stream(biggest).forEach(System.out::print);
    }
}
