package bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class No10953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, a, b;
		String str;
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			st = new StringTokenizer(str, ",");
			while (st.hasMoreTokens()) {
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				System.out.println(a + b);
			}
		}
	}

}
