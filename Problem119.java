import java.util.*;

class Problem119 {
	public Problem119(){
		ArrayList<Long> a = new ArrayList<Long>();
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		long limit = (long)Math.pow(number,15);
		for(long b = 2; b < 100; b++){
			for(int e = 2; e > 0; e++){
				long p = (long)Math.pow(b,e);
				if(p > limit){
					break;
				}
				if(b == SumDigits(p)){
					a.add(p);
				}
			}
		}
		Collections.sort(a);
		for(int i = 0; i < a.size(); i++){
			System.out.println(a.get(i) + " ");
		}
	}

	public long SumDigits(long n){
		int sum = 0;
		while(n > 0){
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
}

public class Main_119 {
	
	public static void main(String[] args) {
		new Problem119();
	}
}
