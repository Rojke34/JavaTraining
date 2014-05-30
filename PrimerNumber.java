import java.util.*;
public class PrimerNumber{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	

		System.out.println("Type initial number");
		int initialNumber = Integer.parseInt(scanner.nextLine());

		System.out.println("Type final number");
		int finalNumber = Integer.parseInt(scanner.nextLine());

		System.out.println("What are you want to show you? Primes or Perfects (1 or 2)");
		String answer = scanner.nextLine();

		if (answer.equalsIgnoreCase("1")) {
			for ( int number = initialNumber; number < finalNumber ; number++) {
				if (isOrNotPrime(number)) {
					System.out.println(" " + number );
				}
			}
		}else if(answer.equalsIgnoreCase("2")){
			for ( int number = initialNumber; number < finalNumber ; number++) {
				if (isOrNotPerfect(number)) {
					System.out.println(" " + number );
				}
			}
		} else{
			System.out.println("Bye!");
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

	public static boolean isOrNotPerfect( int number ){
		int numerator = 0;
		for (int diviser = 1; diviser < number;  diviser++) {
			if(number % diviser == 0){
				numerator += diviser; 
			}
		}
		return ((numerator / number) == 1);
	}
}