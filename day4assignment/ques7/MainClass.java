package assignment.ques7;
public class MainClass {
	public static void main(String[] args)throws InterruptedException {
		Resource r=new Resource();
		Thread t1=new Thread(new PrintWorker(r,"Hello"));
		Thread t2=new Thread(new  PrintWorker(r,"World"));
		Thread t3=new Thread(new  PrintWorker(r,"Renu"));
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.print("Threads Exit...");
	}
}
