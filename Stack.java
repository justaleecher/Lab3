


class Stack {
	private LinkNode top;
	private int LinkNodesCount;

	public Stack() {
		this.top = null;
		this.LinkNodesCount = 0;
	}

	// Utility function to add an element `x` to the stack
	public void push(Currency x) // insert at the beginning
	{
		// allocate a new LinkNode in a heap
		LinkNode LinkNode = new LinkNode(x);

		System.out.println("Inserting ");

		// set data in the allocated LinkNode
		LinkNode.setData(x);

		// set the .next pointer of the new LinkNode to point to the current
		// top LinkNode of the list
		LinkNode.setNext(top);

		// update top pointer
		top = LinkNode;

		// increase stack's size by 1
		this.LinkNodesCount += 1;
	}

	// Utility function to check if the stack is empty or not
	public boolean isEmpty() {
		return (top == null);
	}

	// Utility function to return the top element of the stack
	public Currency peek() {
		// check for an empty stack
		if (isEmpty()) {
			System.out.println("The stack is empty");
			System.exit(-1);
		}
		return top.getData();
	}

	// pop a top element from the stack
	public Currency pop() 
	{
		// check for stack being empty
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			System.exit(-1);
		}

		// get top LinkNode's data
		Currency top = peek();

		System.out.println("Removing ");
		top.print();
		// decrease stack's size by 1
		this.LinkNodesCount -= 1;

		// update the top pointer to point to the next LinkNode
		this.top = (this.top).getNext();

		return top;
	}

	// get size of the stack
	public int size() {
		return this.LinkNodesCount;
	}
}



