import java.math.BigInteger;
import java.util.*;


public final class Problem29{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(new Problem29().run(scan.nextInt()));
	}
	Set<BigInteger> generated;
	public String run(int num) {
		generated = new HashSet<BigInteger>();
		for (int a = 2; a <= num; a++) {
			for (int b = 2; b <= num; b++)
				generated.add(BigInteger.valueOf(a).pow(b));
		}
		return Integer.toString(generated.size());
	}
}
