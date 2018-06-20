package tiagomac.org;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		Integer[] arr = new Integer[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		List l = Arrays.asList(arr);
		Collections.reverse(l);
		l.stream().forEach(x -> {
			if (l.lastIndexOf(x) == l.size()-1) {
				System.out.print(x);
			} else {
				System.out.print(x + " ");
			}
		});
	}
}