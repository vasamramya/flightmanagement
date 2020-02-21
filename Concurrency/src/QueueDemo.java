import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBlockingQueue<Integer> q= new ArrayBlockingQueue<Integer>(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		
		try {
			q.put(6);
		} catch (InterruptedException e) {
			System.err.println("queue is full");
		}
		System.out.println(q);
		

	}

}
