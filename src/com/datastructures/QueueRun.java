package com.datastructures;

public class QueueRun {
	public static void main(String[] args){
		 QueueArray<Integer> q= new QueueArray<Integer>(5);
		 q.Queue(5);
		 q.Queue(2);
		 q.Queue(3);
		 q.Queue(6);
		 q.Queue(8);
		 System.out.println("Dequeu:"+ q.DeQueue());
		 q.Queue(10);
	 }
}
