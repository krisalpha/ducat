// this program computes demonstrates usage of BigInt class in java 
import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args) {
		BigInteger fac = new BigInteger.valueOf(1);
		for(int i = 2; i <= 25; i++)
			fac = fac.multiply(BigInteger.valueOf(i));
		System.out.println(fac);
	}
}