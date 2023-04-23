class CalculateGrade {
	public static void main(String args[]) {
		String name = args[0];
		int marks = 74;
		String result;
		if (marks > 80) {
			result = "A+";
		}
		else if (marks > 70 && marks <= 80) {
			result = "A";
		}
		else {
			result = "B+";
		}
		// name has got the result grade
		System.out.println(name + " has got " + result + " grade");
	}
}