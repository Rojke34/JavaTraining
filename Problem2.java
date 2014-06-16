public class Problem2{
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int temp;
		int limite = 4000000;
		int sumatoria = 0;

		System.out.println(num1);
		System.out.println(num2);

		while( num1 + num2 <= limite){
			temp = num1;
			num1 = num2;
			num2 = temp + num1;
			if (num2 % 2 == 0) {
				sumatoria += num2;	
			}
			System.out.println(num2);
		}
		System.out.println("Result: " + sumatoria);
	}
}