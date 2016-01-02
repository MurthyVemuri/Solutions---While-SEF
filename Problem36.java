import java.util.*;

public final class Problem36{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(new Problem36().run(scan.nextInt(),scan.nextInt()));
	}

	public static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static boolean isPalindrome(String s) {
		return s.equals(reverse(s));
	}
	
	
	public String run(int n, int k) {
		long sum = 0;
		for (int i = 1; i < n; i++) {
			if (isPalindrome(Integer.toString(i, 10)) && isPalindrome(Integer.toString(i, k)))
				sum += i;
		}
		return Long.toString(sum);
	}
	
}
