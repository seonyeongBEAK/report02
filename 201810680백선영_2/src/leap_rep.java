import java.util.Scanner;

	public class leap_rep {
		public static void main(String[] args) {
			System.out.println("������ �Է��Ͻÿ�.");
			Scanner leap1 = new Scanner(System.in);
			int year = leap1.nextInt();
			while(year>=0) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year + "���� ����");
			} else {
				System.out.println(year + "���� ���");
			}
		}
	}
}