import java.util.*;
public class Validate{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type date to validate");
		System.out.println("Type Date");
		int date = sc.nextInt();
		System.out.println("Type month");
		int month = sc.nextInt();
		System.out.println("Type year");
		int year = sc.nextInt();

		validate(date, month, year);
	}

	public static int validate(int x, int y, int z){
		System.out.println( "Dia " + x );
		System.out.println( "Mes " + y );
		System.out.println( "Anyo " + z );

		if (z % 4 == 0) {
			System.out.println("Anyo bisiesto");
			if (y == 2 && x > 29){
				System.out.println("Algo va mal con la fecha");
			}else{
				System.out.println("Dia: " + x + " Mes " + y + " Anyo " + z);
			}
		}
		return 0;
	}
}