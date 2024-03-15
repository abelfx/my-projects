import java.util.*;

public class Queues {
    public static void main(String[] args) {
		
    	//// Intro to Queue
    	
//		Queue<String> queue = new LinkedList<String>();
		
		// queue.offer() is used to add arguments next to one another;
//		queue.offer("Karen");
//		queue.offer("Giga-chad");
//		queue.offer("Karl");
//		queue.offer("Harold");
//		
		// queue.poll() is used to remove the first Argument inside the queue;
//		queue.poll();
//		
//		System.out.println(queue.contains("Karen"));
		
		
		//// Priority queues
    	
    	Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());
    	queue.offer(3.95);
		queue.offer(2.0);
		queue.offer(1.8);
		queue.offer(3.45);
		
		while (!queue.isEmpty()) { 
			System.out.println(queue.poll());
		}
		
		System.out.println();
		
		Queue<String> QUEUE = new PriorityQueue<String>();
    	QUEUE.offer("A");
		QUEUE.offer("C");
		QUEUE.offer("B");
		QUEUE.offer("D");
		
		while (!QUEUE.isEmpty()) { 
			System.out.println(QUEUE.poll());
		}
		
		
	}

}
