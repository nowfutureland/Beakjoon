import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int a = (B%10)*A;
		int b = (B%100)/10*A;
		int c = (B/100)*A;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(A*B);

	}

}
