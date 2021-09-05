package CodeForcesB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
 // snippet
public class SumOfDigit {
 // Question Link : https://codeforces.com/contest/102/problem/B
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();
		String string = sc.next();
		long sum =0;
		for (int i = 0; i < string.length(); i++) {
			sum+=Integer.parseInt(string.charAt(i)+"");
		}
		// single digit 
//		System.out.println(sum);
		
		int count =0;
		if(string.length()>=2) {
			count =1;
		}
		while(sum>9) {
			sum = getSum(sum);
			count++;
		}
		System.out.println(count);
		
		
	}
 
	private static long getSum(long sum) {
	// TODO Auto-generated method stub
		long ans =0;
		while(sum!=0) {
			ans+=sum%10;
			sum=sum/10;
		}
	return ans;
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