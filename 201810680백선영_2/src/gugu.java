import java.util.Scanner;

public class gugu {
	
	public static void main(String[] args) {
		Scanner gugu = new Scanner(System.in);
		int x;
		System.out.print("수를 입력하세요");
		x = gugu.nextInt();
		int sum = 0;
		for(int i = 1; i<10; i++) {
			sum = i*x;
			System.out.print(x+"*"+i+"="+sum);
			System.out.println("");
		}
		
	}
}
