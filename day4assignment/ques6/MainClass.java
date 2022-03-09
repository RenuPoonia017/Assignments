package assignment.ques6;

public class MainClass {

	public static void main(String[] args)throws Exception {
		System.out.println("Thread Started ");
		Producer p = new Producer();
        Consumer c = new Consumer(p);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t2.start();
        t1.start();
        t2.join();
        t1.join();
		System.out.println("Thread ended ");

	}

}
