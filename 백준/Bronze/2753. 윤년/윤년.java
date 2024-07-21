
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int b = A%4;
		int c = A%100;
		int d = A%400;
		
		if((b==0) && ((c!=0) || (d==0))) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}

}
