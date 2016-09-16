import java.util.*;

//http://codeforces.com/problemset/problem/296/A

public class YaroslavAndPermutations {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        int[] numbers = new int[n];
        HashMap<Integer, Integer> counts = new HashMap<>();

        int biggestCount = 0;
        int biggestNumber = 0;

        for (int i = 0; i < n; i++) {
            int x = reader.nextInt();
            numbers[i] = x;

            if (counts.containsKey(x)) {
                counts.put(x, counts.get(x) + 1);
            } else {
                counts.put(x, 1);
            }

            if (counts.get(x) > biggestCount) {
                biggestCount = counts.get(x);
                biggestNumber = x;
            }
        }

        if (Math.ceil(n / 2.0) >= biggestCount) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
