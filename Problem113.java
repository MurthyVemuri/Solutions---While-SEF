import java.util.*;

public class Problem113 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        for(int l = 1; l <= count; l++) {
            int number  = scan.nextInt();
            long sum = 0;
            for(int x = 1; x <= number; x++){
                long[] a = Increasing(x);
                long[] b = Decreasing(x);
                long ssum = 0;
                for(int i = 0; i < 10; i++){
                    ssum += a[i];
                }
                for(int i = 0; i < 10; i++){
                    ssum += b[i];
                }
                ssum = ssum-9;
                sum += ssum;
            }
            System.out.println(sum);
        }
	}
	
	static long[] Increasing(int n){
		if(n <= 1){
			return new long[]{0,1,1,1,1,1,1,1,1,1};
		}
		long[] a = Increasing(n-1);
		long[] b = new long[10];
		for(int i = 9; i >= 0; i--){
			for(int j = 0; j <= i; j++){
				b[i] += a[j];
			}
		}
		return b;
	}
	
	static long[] Decreasing(int n){
		if(n <= 1){
			return new long[]{0,1,1,1,1,1,1,1,1,1};
		}
		long[] a = Decreasing(n-1);
		long[] b = new long[10];
		for(int i = 0; i < 10; i++){
			for(int j = i; j < 10; j++){
				b[i] += a[j];
			}
		}
		return b;
	}
}
