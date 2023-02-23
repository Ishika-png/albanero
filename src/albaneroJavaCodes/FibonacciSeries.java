package albaneroJavaCodes;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 0, b = 1;
		System.out.print(a + " " + b);
		
		for(int i=2; i<n; i++) {
			System.out.print(" " + solve(i, new int[i+1]));
		}
		
	}

	public static int solve(int n, int[] temp) {
        if(n==0 || n==1) return n;
        if(temp[n] != 0) return temp[n];
        
        return temp[n] = solve(n-1, temp) + solve(n-2, temp);
    }
	
}
