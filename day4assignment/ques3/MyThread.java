package assignment.ques3;

public class MyThread {
	public static void main(String[] args) {
		Runnable runObj=new MyRunnable();
		
		Thread t1=new Thread(runObj);
		
		t1.start();
	}

}
