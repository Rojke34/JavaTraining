import java.util.*;
public class Problem6{
	public static void main(String[] args) {
		Problem6 test = new Problem6();
		test.FindThedifferenceBetweenSumOfTheSquaresAndTheSquareOfTheSum(100);
	}

	public static void FindThedifferenceBetweenSumOfTheSquaresAndTheSquareOfTheSum( int number ){
		int sumSquares = 0; 
		int squaresSum = 0;
		for ( int i = 1; i <= number; i++) {
			sumSquares += (i * i);
			squaresSum += i;
		}
		System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is: " + ((squaresSum * squaresSum)-sumSquares));
	}
}