public class Problem1{
	public static void main(String[] args) {
		findSumOfMultiples(1000);
	}

	public static void findSumOfMultiples( int numberLimite ){
		int multipleOf3 = 0;
		int multipleOf5 = 0;
		for ( int number = 0; number < numberLimite ; number++ ) {
			if (number % 3 == 0) {
				multipleOf3 += number;
			}else if (number % 5 == 0) {
				multipleOf5 += number;
			}
		}
		System.out.println(" the sum of all the multiples of 3 or 5 below 1000 is: " + (multipleOf3+multipleOf5));
	}
}