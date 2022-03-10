package assignment.ques1;
public class MyThreadMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread  Starts");
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		t1.start();
		t2.start();
		t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Threads is exit");
	}

}
