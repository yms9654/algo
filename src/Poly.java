import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Poly {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input/poly.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int c = Integer.parseInt(line);
		for(int i=0; i<c; i++) {
			line = br.readLine();
			int n = Integer.parseInt(line);
			System.out.println(n);
			solu();
		}
		
	}

	private static void solu() {
		// TODO Auto-generated method stub
		
	}
}
