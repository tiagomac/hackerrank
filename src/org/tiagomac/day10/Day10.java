package org.tiagomac.day10;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		int d = n;
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		scanner.close();

		int max = 0;
		int maxTemp = 0;
		while (n > 0) {
			int resto = n % 2;
			if (resto != 0) {
				maxTemp++;
				if (maxTemp > max) {
					max = maxTemp;
				}
			} else {
				maxTemp = 0;
			}
			n = n / 2;
		}
		System.out.println(max);
	}
}
