package project04;

public class StackNode_1 {
	int data;
	StackNode_1 link;
}

class LinkedStack_1{
	private StackNode_1 top;
	
	public boolean isEmpty() {
		return(top == null);
	}
	public void push(int item) {
		StackNode_1 newNode = new StackNode_1();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail Linked Stack is empty!");
			return 0;
		}
		else {
			int item = top.data;
			top = top.link;
			return item;
		}
	}
}
