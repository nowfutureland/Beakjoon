import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int cnt = 0 ;
		
		for(int i=1; i<=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A+B;
			cnt += 1;
			System.out.println("Case #"+cnt+": "+sum);
			}
	}

}
