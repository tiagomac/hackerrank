package org.tiagomac.day21;

public class Printer <T> {

	public static <E> void printArray(E[] arr) {
		for (E element : arr) {
			System.out.println(element);
		}
	}
	
}
