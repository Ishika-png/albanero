package albaneroJavaCodes;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(isArmstrong(n));
	}

	private static boolean isArmstrong(int n) {
		int d = 0, ld = 0, sum = 0;
		int temp = n;
		while(temp > 0) {
			temp = temp/10;
			d++;
		}
		
		temp = n;
		while(temp > 0) {
			ld = temp%10;
			sum += Math.pow(ld, d);
			temp = temp/10;
		}
		
		if(n == sum) {
			return true;
		} else {
			return false;
		}
	}

}
