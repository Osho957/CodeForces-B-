package CodeForcesB;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Collections;
import java.util.StringTokenizer;

 // snippet
public class Coins {
 // Question Link : https://codeforces.com/contest/47/problem/B
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();
		 int A = 0, B = 0, C = 0;
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        map.put('A', 0);
	        map.put('B', 0);
	        map.put('C', 0);
	        for (int i = 0; i < 3; i++) {
	            String c = sc.next();
	            if (c.charAt(1) == '>') {
	                int x = map.get(c.charAt(0));
	                x++;
	                map.put(c.charAt(0), x);
	            } else if (c.charAt(1) == '<') {
	                int x = map.get(c.charAt(2));
	                x++;
	                map.put(c.charAt(2), x);
	            }
	        }

	        if (map.get('A') == map.get('B') || map.get('A') == map.get('C') || map.get('C') == map.get('B')) {
	            System.out.println("Impossible");
	        } else {
	            if (map.get('A') == 0) {
	                System.out.print("A");
	            } else if (map.get('B') == 0) {
	                System.out.print("B");
	            } else if (map.get('C') == 0) {
	                System.out.print("C");
	            }
	            if (map.get('A') == 1) {
	                System.out.print("A");
	            } else if (map.get('B') == 1) {
	                System.out.print("B");
	            } else if (map.get('C') == 1) {
	                System.out.print("C");
	            }
	            if (map.get('A') == 2) {
	                System.out.print("A");
	            } else if (map.get('B') == 2) {
	                System.out.print("B");
	            } else if (map.get('C') == 2) {
	                System.out.print("C");
	            }
	        }
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