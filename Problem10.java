import java.math.BigInteger;
import java.util.*;
public class Problem10{
	public static void main(String[] args) {
		
		List<BigInteger> list = new ArrayList<BigInteger>();
		BigInteger bigResult = new BigInteger("0");
		
		int inicio = 1;
		int limite = 2000000;
		for (int number = inicio; number < limite; number++ ) {
			System.out.println("Number to test: " + number);
			if (isPrime( number )) {
				System.out.println("Primo encontrado: " + number);
				list.add(BigInteger.valueOf( number ));
			}
		}
		System.out.println("Valores en lista: " + list);

		for (BigInteger element: list ) {
			bigResult = bigResult.add(element);
		}
		System.out.println("resultado encontrado: " + bigResult);
	}

	public static boolean isPrime( int number ){
		int cont = 0;
		for (int diviser = 1; diviser <= number;  diviser++) {
			if (number % diviser == 0) {
				cont = cont + 1;
			}
		}
		return cont == 2;
	}
}