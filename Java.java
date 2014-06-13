import java.awt.*;
import java.util.*;
public class Java{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite un numero");
		int var = sc.nextInt();


		if (var > 70 && var < 100) {
			System.out.println("esta en el rango");
		}else{
			System.out.println("no esta en el rango");
		}

	}
}