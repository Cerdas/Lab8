
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayQ arr = new ArrayQ();
		int[] nums = { 1, 7, 3, 4, 9, 2 };
		for (int i = 0; i < nums.length; i++) {
			arr.enqueue(nums[i]);
		}
		System.out.println("Pop of top number from ArrayStack");
		System.out.println("Size of ArrayStack: " + arr.size());
		for (int i = 0; i < nums.length; i++) {
			System.out.println(arr.dequeue());
		}

		LinkedQueue queue = new LinkedQueue();
		for (int i = 0; i < nums.length; i++) {
			queue.enqueue(nums[i]);
		}
		System.out.println("Pop of top number from LinkedStack");
		System.out.println("Size of LinkedStack: " + queue.size());
		for (int i = 0; i < nums.length; i++) {

			System.out.println(queue.dequeue());
		}

		for (int i = 0; i < nums.length; i++) {
			queue.enqueue(nums[i]);
		}
		
		System.out.println("Removing middle of LinkedQueue");
		queue.removeMiddle();
		System.out.println("Size of LinkedQueue after removingMiddle: " + queue.size());
		System.out.println("Dequeue the LinkedQueue after removingMiddle");
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
		
	}

}
