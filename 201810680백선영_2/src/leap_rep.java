import java.util.Scanner;

	public class leap_rep {
		public static void main(String[] args) {
			System.out.println("연도를 입력하시오.");
			Scanner leap1 = new Scanner(System.in);
			int year = leap1.nextInt();
			while(year>=0) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year + "년은 윤년");
			} else {
				System.out.println(year + "년은 평년");
			}
		}
	}
}