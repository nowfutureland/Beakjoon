import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arry = new int[sc.nextInt()];
		String N = sc.next();
		int sum = 0;
		
		for(int i=0; i<arry.length; i++) {
			String a = N.substring(i,i+1);
			arry[i] = Integer.parseInt(a);
		}
		for(int i=0; i<arry.length; i++) {
			sum += arry[i];
		}
		System.out.println(sum);
	}
}
