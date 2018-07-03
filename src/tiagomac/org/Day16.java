package tiagomac.org;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		try {
			Integer num = Integer.parseInt(S);
			System.out.println(num);
		} catch (NumberFormatException nfe) {
			System.out.println("Bad String");
		}
	}
}