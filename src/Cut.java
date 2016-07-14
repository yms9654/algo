import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Cut {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input/cut.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		int t = Integer.parseInt(temp);
		for(int i=0; i<t; i++) {
			temp = br.readLine();
			StringTokenizer st = new StringTokenizer(temp);
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			temp = br.readLine();
			st = new StringTokenizer(temp);
			int[] arr = new int[n];
			for(int j=0; j<n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			solu();
		}
	}

	private static void solu() {
		// TODO Auto-generated method stub
		
	}
}
