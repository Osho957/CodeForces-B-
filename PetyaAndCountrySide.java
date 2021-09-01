package CodeForcesB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
 
public class PetyaAndCountrySide {
 // Question Link :
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();
		int T=sc.nextInt();
		int arr[] = new int[T];
		for (int tt=0; tt<T; tt++) {
			arr[tt]=sc.nextInt();
		}
	  
		int max =1;
		for (int i = 0; i < arr.length; i++) {
			int j =1;
			int x = i;
			int y = i;
			while(x>0&&arr[x-1]-arr[x]<=0) {
				j++;
				x--;
			}
			while(y<T-1&&arr[y+1]-arr[y]<=0) {
				y++;
				j++;
			}
			max = Math.max(max, j);
		}
			System.out.println(max);
		
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