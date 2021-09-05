package CodeForcesB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
 // snippet
public class CasiaAndPylons {
 // Question Link :https://codeforces.com/contest/463/problem/B
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
       int sum =0;
       int x =0;
       int ans =0;
       for (int i = 0; i < a.length; i++) {
	    sum+=x-a[i];
	    if(sum<0) {
	    	ans+=Math.abs(sum);
	    	sum=0;
	    }
	    x=a[i];
	}
       System.out.println(ans);
		
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