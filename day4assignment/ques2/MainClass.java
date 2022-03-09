package assignment.ques2;
public class MainClass {
	public static void main(String[] args)throws InterruptedException {
		System.out.println("Thread  Starts");
		Thread t1=new Thread(new MyThread());
		Thread t2=new Thread(new MyThread());
		Thread t3=new Thread(new MyThread());
		t1.start();
		t2.start();
		t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Threads is exit");
	}

}
