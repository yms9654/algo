import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

// https://algospot.com/judge/problem/read/POLY
public class Poly {
	private static int[][] memo;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input/poly.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int c = Integer.parseInt(line);
		for(int i=0; i<c; i++) {
			line = br.readLine();
			int n = Integer.parseInt(line);
			int ret = 0;
			memo = new int[n+1][n+1];
			for(int j=1; j<=n; j++) {
				ret += solu(n, j); 
			}
			System.out.println(ret);
		}
		
	}

	private static int solu(int n, int first) {
		if(n == first)
			return 1;
		if(memo[n][first] != 0) {
			return memo[n][first];
		}
		int ret = 0;
		for(int second = 1; second <= n-first; second++) {
			ret += (second + first - 1) * solu(n-first, second);
		}
		return memo[n][first] = ret;
	}
}
