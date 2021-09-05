package CodeForcesB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
 // snippet
public class BurglarAndMatches {
 // Question Link : https://codeforces.com/contest/16/problem/B
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();
		int n = sc.nextInt();
		int m = sc.nextInt();
       int details[][] = new int[m][2];
       
       for (int i = 0; i < details.length; i++) {
	for (int j = 0; j < 2; j++) {
		details[i][j]= sc.nextInt();
	}
	
	}
       // to sort on basis of value
       Arrays.sort(details,(a,b)->Integer.compare(a[1], b[1]));
  
       int ans =0;
       
       for (int i =details.length-1;i>=0; i--) {
		
			ans+=details[i][1]*Math.min(n,details[i][0]);
			n-=Math.min(n,details[i][0]);
		
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