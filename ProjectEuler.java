public class ProjectEuler{
	public static void main(String[] args) {

		int numberEuler = 1;
		int cont = 0;
		do{
			for (int divisor = 1; divisor <= 20 ; divisor++) {
				if (numberEuler % divisor == 0) {
					cont += 1;
				}
			}
			numberEuler++;
			if (cont != 20) {
				cont = 0;
			}
			System.out.println(" " + numberEuler);
		}while( cont != 20 );
		
	}
}