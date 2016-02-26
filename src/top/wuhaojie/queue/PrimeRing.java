package top.wuhaojie.queue;

import java.util.LinkedList;

public class PrimeRing {
	public PrimeRing(int n) {
		LinkedList<Integer> ring = new LinkedList<>();
		ring.add(new Integer(1));
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		for (int i = 2; i <= n; i++)
			queue.enqueue(new Integer(i));
		int i = 0;
		while (!queue.isEmpty()) {
			int k = queue.dequeue().intValue();
			if (isPrime(ring.get(i) + k)) {
				i++;
				ring.add(new Integer(k));
			} else {
				queue.enqueue(new Integer(k));
			}
		}
		System.out.println(ring.toString());

	}

	private boolean isPrime(int k) {
		if (k == 2)
			return true;
		if (k < 2 || k > 2 && k % 2 == 0)
			return false;
		int j = (int) Math.sqrt(k);
		if (j % 2 == 0)
			j--;
		while (j > 2 && k % j != 0)
			j -= 2;
		return j < 2;
	}
	
	public static void main(String[] args) {
		new PrimeRing(10);
	}
	
}
