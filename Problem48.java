import java.util.*;
import java.math.BigInteger;
public class Problem48{
	public static void main(String[] args) {
		BigInteger num = new BigInteger("0");
		BigInteger sum = new BigInteger("0");

		for (int i = 1; i <= 1000; i++ ) {
			num = BigInteger.valueOf(i);
			sum = sum.add( num.pow(i) );
		}

		System.out.println(sum);

	}
}