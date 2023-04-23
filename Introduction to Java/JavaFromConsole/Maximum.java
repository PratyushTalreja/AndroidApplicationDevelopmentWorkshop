class Maximum {
	public static void main(String args[]) {
		System.out.println(maxOfThreeNumbers(4, 7, 6));
	}
	public static int maxOfThreeNumbers (int a, int b, int c) {
		int max;
		if (a > b){
			if (a > c) {
				max = a;
			}
			else {
				max = c;
			}
		}
		else {
			if (b > c) {
				max = b;
			}
			else {
				max = c;
			}
		}
		// max = (a > b ? (a > c ? a : c) : (b > c) ? b : c);
		return max;
	}
}