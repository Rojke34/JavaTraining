public class Problem7{
	public static void main(String[] args) {
		
		int number = 1;
		boolean activator = true;
		int contadorPos = 0; 
		while( contadorPos != 10001 ){
			if (isOrNotPrime( number )) {
				System.out.println( number + " " + (contadorPos += 1));
			}
			number += 1;
		}
	}

	public static boolean isOrNotPrime( int number ){
		int cont = 0;
		for (int diviser = 1; diviser <= number;  diviser++) {
			if (number % diviser == 0) {
				cont = cont + 1;
			}
		}
		return cont == 2;
	}
}