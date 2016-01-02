import java.util.*;

public class Problem15{	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countTest = scan.nextInt();
		for(int k = 1; k <= countTest; k++) {
			int sizeOne  = scan.nextInt();
            int sizeTwo = scan.nextInt();
			long[][] a = new long[sizeOne+1][sizeTwo+1];
			for(int i = 0; i < sizeTwo+1; i++){
				a[i][sizeTwo] = 1;
				a[sizeOne][i] = 1;
			}
			for(int x = sizeOne-1; x >= 0; x--){
				for(int y = sizeTwo-1; y >= 0; y--){
					a[x][y] = a[x][y+1] + a[x+1][y];
				}
			}
			System.out.println(a[0][0]);
		}
	}
}
