public class Queue {
	LinkNode front, rear;

	public Queue() {
		this.front = this.rear = null;
	}

	// add to the queue
	public Currency peekFront() {
		return this.front.getData();
	}
	public Currency peekRear() {
		return this.rear.getData();
	}

	public void enqueue(Currency x) {

		// Create a new node
		LinkNode temp = new LinkNode(x);

		// If queue is empty, then new node is front and rear both
		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}

		// Add the new node at the end of queue and change rear
		this.rear.setNext(temp);
		this.rear = temp;
	}

	// Method to remove an key from queue.
	public Currency dequeue() {
		// If queue is empty, return NULL.
		if (this.front == null) {
			System.out.print("Empty queue error");
		}
		// Store previous front and move front one node ahead
		LinkNode temp = this.front;
		this.front = this.front.getNext();

		// If front becomes NULL, then change rear also as NULL
		if (this.front == null) {
			this.rear = null;
		}
		return temp.getData();
	}
}
