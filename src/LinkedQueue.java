
public class LinkedQueue {

	LinkedNode front;
	LinkedNode back;
	int count;

	public LinkedQueue() {
		front = null;
		back = null;
		count = 0;
	}

	public void enqueue(int a) {
		LinkedNode node = new LinkedNode(a);
		if (isEmpty()) {
			front = node;
		} else {
			back.next = node;
		}
		back = node;
		count++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		if (front == back) {
			int a = front.x;
			front = null;
			back = null;
			count--;
			return a;
		} else {
			int a = front.x;
			front = front.next;
			count--;
			return a;
		}
	}

	public int first() {
		return front.x;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public int size() {
		return count;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += front.x;
			front = front.next;
		}

		return s;
	}
	
	public void removeMiddle() {
		int length = count;
		int mid = (count / 2);
		int number = 0;
		int[] arr = new int[length - 1];
		for (int i = 0; i < length; i++) {
			if(i != mid) {
				arr[number] = dequeue();
				number++;
			}else {
				dequeue();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			enqueue(arr[i]);
		}
	}
}
