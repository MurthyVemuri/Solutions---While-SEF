import java.util.*;


public final class Problem_124{
	
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int countTest = scan.nextInt();
		for(int  i = 1; i <= countTest; i++){
			int number = scan.nextInt();
			int check = scan.nextInt();		
			System.out.println(new Problem_124().run(number,check));
		}
	}
	
	
	public String run(int LIMIT , int check) {
		int[] rads = new int[LIMIT + 1];
		Arrays.fill(rads, 1);
		for (int i = 2; i <= LIMIT; i++) {
			if (rads[i] == 1) {
				for (int j = i; j <= LIMIT; j += i)
					rads[j] *= i;
			}
		}
		
		IntPair[] data = new IntPair[LIMIT];
		for (int i = 0; i < data.length; i++)
			data[i] = new IntPair(rads[i + 1], i + 1);
		Arrays.sort(data);
		return Integer.toString(data[check - 1].b);
	}
	
	private static final class IntPair implements Comparable<IntPair> {

		public final int a;
		public final int b;
		
		public IntPair(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		public int compareTo(IntPair other) {
			if(a < other.a) return -1;
			else if (a > other.a) return +1;
			else if (b < other.b) return -1;
			else if (b > other.b) return +1;
			else return  0;
		}	
	}
}
