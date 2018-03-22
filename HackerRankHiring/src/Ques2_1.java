
import java.io.*;
import java.util.*;
 
public class Ques2_1 {
	FastScanner in;
	PrintWriter out;
 
	void solve() {
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			char[] c = in.next().toCharArray();
			int pr = 0;
			for (char cc : c) {
				pr |= (1 << (cc - '0'));
			}
			a[i] = pr;
		}
		int m = 10;
		int countProfiles = 1 << m;
		int hm = m / 2;
		int countHalfProfiles = 1 << hm;
		int[] dp1 = new int[countProfiles];
		for (int i = 0; i < n; i++) {
			int prr = a[i] & ((1 << hm) - 1);
			int prl = a[i] >> hm;
			int pr = 0;
			do {
				dp1[(pr << hm) + prr]++;
				pr = (pr - 1) & prl;
			} while (pr != 0);
		}
		int[] dp2 = new int[countProfiles];
		int halfMask = (1 << hm) - 1;
		for (int pr = 0; pr < countProfiles; pr++) {
			int prr = pr & halfMask;
			int prl = pr ^ prr;
			int max = halfMask ^ prr;
			int prc = 0;
			do {
				int pr2 = halfMask ^ prc;
				dp2[pr] += dp1[prl | pr2];
				prc = (prc - 1) & max;
			} while (prc != 0);
		}
		int mask = (1 << m) - 1;
		long full = 0;
		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == mask) {
				full++;
			} else {
				int need = mask ^ a[i];
				ans += dp2[need];
			}
		}
		ans += full * (n - full);
		ans /= 2;
		ans += full * (full - 1) / 2 + full;
		out.println(ans);
	}
 
	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
 
		solve();
 
		out.close();
	}
 
	class FastScanner {
		BufferedReader br;
		StringTokenizer st;
 
		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(in.br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
 
	public static void main(String[] args) {
		new Ques2_1().run();
	}
} 
