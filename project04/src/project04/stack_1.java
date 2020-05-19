package project04;

public interface stack_1 {
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}
class StackNode_1{
	char data;
	StackNode_1 link;
}
class LinkedStack_1 implements Stack{
	private StackNode top;

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == null);
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
	
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!");
			return 0;
		}
		else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!");
		}
		else {
			top = top.link;
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!");
			return 0;
		}
		else 
			return top.data;
		}
		public void printStack() {
			if(isEmpty())
				System.out.printf("Deleting fail! Linked Stack is empty! %n %n");
			else {
				StackNode temp = top;
				System.out.println("Linked Stack>> ");
				while(temp != null) {
					System.out.printf("\t %c \n", temp.data);
					temp = temp.link;
				}
				System.out.println();
			}
		}
	}

