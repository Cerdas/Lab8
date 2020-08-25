import java.util.Arrays;

public class ArrayQ {

	static int DEFAULTCAPACITY = 100;
	int front;
	int back;
	int count;
	int[] queue;
	
	public ArrayQ() {
		front = 0;
		back = 0;
		count = 0;
		queue = new int[DEFAULTCAPACITY];
	}
	
	public void enqueue(int x) {
		if (size() == queue.length) {
			expandCapacity();
		}
		queue[back] = x;
		back = back + 1;
		count++;
	}
	
	public void expandCapacity() {
		queue = Arrays.copyOf(queue, queue.length * 2);
	}
	
	public int dequeue() {
		if(count == 0) {
			return -1;
		}else {
			int a = queue[front];
			front = front + 1;
			count--;
			return a;
		}
	}
	
	public int peek() {
		return queue[front];
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public int size() {
		return count;
	}
	
	public String toString() {
		return null;
	}
}
