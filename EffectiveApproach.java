package CodeForcesB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
 // snippet
public class EffectiveApproach {
 // Question Link : http://codeforces.com/contest/227/problem/B
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();
		int T=sc.nextInt();
		int a[] = new int[T];
		int count[] = new int[T+1];
		
		for (int tt=0; tt<T; tt++) {
			a[tt]= sc.nextInt();
			count[a[tt]]=tt+1;
		}
		int q = sc.nextInt();
		long x =0;
		long y =0;
		while(q-->0) {
		int  n = sc.nextInt();
		x+=count[n];
		y+=T-count[n]+1;
		}
		System.out.println(x+" "+y);
		

	}
 
	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
 
	
}