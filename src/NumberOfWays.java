// http://codeforces.com/problemset/problem/466/C

import java.util.*;
import java.lang.*;
import java.io.*;

public class NumberOfWays
{
	public static void main (String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		int mid, left, right, count;
		mid = left = right = count = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
			mid += arr[i];
		}
		
		if (n < 3) {
			System.out.println(0);
			return;
		}
		
		int i = 1;
		int j = n-1;
		
		mid -= arr[i-1];
		left += arr[i-1];
		while(2 * left < mid) {
			i ++;
			left += arr[i-1];
			mid -= arr[i-1];
		}
		if (2 * left != mid) {
			System.out.println(count);
			return;
		}
		
		
		mid -= arr[j];
		right += arr[j];
		while(right < mid) {
			j --;
			right += arr[j];
			mid -= arr[j];
		}
		if (right != mid) {
			System.out.println(count);
			return;
		}
		
		if (left == mid && mid == right) {
			count ++;
		}
		
		int countI = 1;
		while (left == mid && i != j) {
			i++;
			left += arr[i-1];
			mid -= arr[i-1];
			
			if (left+arr[i-1] == mid-arr[i-1]) {
				countI ++;
			}
		}
		left -= arr[i-1];
		mid += arr[i-1];
		i --;
		
		
		int countJ = 1;
		while (right == mid && i != j) {
			j--;
			right += arr[j];
			mid -= arr[j];
			
			if (right+arr[j] == mid-arr[j]) {
				countJ ++;
			}
		}
		right -= arr[j];
		mid += arr[j];
		j ++;
		
		count = countI * countJ;
		System.out.println(count);
	}
}
