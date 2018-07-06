package org.tiagomac.day14;

public class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		this.elements = a;
	}

	public void computeDifference() {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i : elements) {
			min = Math.min(min, i);
			max = Math.max(max, i);
		}
		this.maximumDifference = max - min;
	}

}
