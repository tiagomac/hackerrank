package org.tiagomac.day12;

class Student extends Person {

	private int[] testScores;

	/*
	 * Class Constructor
	 * 
	 * @param firstName - A string denoting the Person's first name.
	 * 
	 * @param lastName - A string denoting the Person's last name.
	 * 
	 * @param id - An integer denoting the Person's ID number.
	 * 
	 * @param scores - An array of integers denoting the Person's test scores.
	 */
	public Student(String firstName, String lastName, int id, int[] testScores2) {
		super(firstName, lastName, id);
		this.testScores = testScores2;
	}

	/*
	 * Method Name: calculate
	 * 
	 * @return A character denoting the grade.
	 */
	public String calculate() {
		int total = 0;
		for (int i = 0; i < testScores.length; i++) {
			total += testScores[i];
		}
		int average = total / testScores.length;
		return (average > 89 ? "O"
				: average > 79 ? "E" : average > 69 ? "A" : average > 54 ? "P" : average > 39 ? "D" : "T");
	}
}