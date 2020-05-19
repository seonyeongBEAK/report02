package project04;
import java.util.Stack;
public class Rev_str {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		String str = "문자열을 역으로 출력하기";
		
		for(int i=0; i<str.length(); i++)
			stack.push(str.charAt(i));
		while(!stack.empty())
			System.out.print(stack.pop());
	}
}
