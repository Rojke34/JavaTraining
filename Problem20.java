import java.util.*;
import java.math.*;
public class Problem20{
	public static void main(String[] args) {

		BigInteger numero       = new BigInteger("100");
		BigInteger getFactorial = new BigInteger("0");
		String add   = "+";
		String equal = "=";
		int result   = 0;

		getFactorial = factorial(numero);
		String numberStr = getFactorial.toString();
		System.out.println(numero + "! = " + numberStr + "\n");
		

		for (int i = 0; i < numberStr.length(); i++ ) {
			result = result + numberStr.charAt(i)-'0';
			if ( i < numberStr.length() - 1) {
				System.out.print(numberStr.charAt(i) + add);	
			}else{
				System.out.println(numberStr.charAt(i) + equal + result);
			}
		}
	}

	public static BigInteger factorial( BigInteger numero ){
		BigInteger uno = new BigInteger("1");
		BigInteger cero = new BigInteger("0");
		if (numero.equals(cero)) {
			return uno;
		}else{
			return numero = numero.multiply( factorial(numero.subtract(uno)) );
		}
	}
}