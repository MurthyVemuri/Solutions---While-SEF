import java.util.*;

public class Problem9 {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countTestcases = scan.nextInt();
		int number = 0;
		for(int l = 1; l <= countTestcases; l++) {
			number = scan.nextInt();
			pythTriplet(number);
		}
	}

	public static void pythTriplet(int number) {
		boolean flag = false;
		int a = 0,b = 0,c = 0;
		for(a = 1; a < number; a++){
			for(b = a+1; b < number; b++){
				for(c = b+1; c < number; c++){
					if( (a + b + c == number) && (a*a + b*b == c*c) ) {
						flag = true;
						System.out.println(a*b*c);
						return;
					}
				}
			}
		}
		if(!flag) {
			System.out.println(-1);
		}
	}
}
