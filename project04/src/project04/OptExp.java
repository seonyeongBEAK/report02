package project04;

public class OptExp {
	private String exp;
	private int expSize;
	private char textCh, openPair;
	
	public boolean testPair(String exp) {
		this.exp = exp;
		LinkedStack_1 S = new LinkedStack_1();
		expSize = this.exp.length();
		for(int i=0; i<expSize; i++) {
			textCh = this.exp.charAt(i);
			char testCh = 0;
			switch(testCh) {
			case '(' :
			case '{' :
			case '[' :
				S.push(textCh); break;
			case ')' :
			case '}' :
			case ']' :
				if(S.isEmpty()) return false;
				else {
					openPair = S.pop();
					if((openPair == '(' && testCh != ')')|
						(openPair == '{' && testCh != '}')|
						(openPair == '[' && testCh != ']'))
					  return false;
					else break;
				}
			}
		}
		if (S.isEmpty()) return true;
		else return false;
		
	}
}
