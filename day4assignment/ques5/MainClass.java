package assignment.ques5;

public class MainClass {

	public static void main(String[] args)throws Exception {
		System.out.println("Threads Started");
		ThreadJoining th1=new ThreadJoining();  
        ThreadJoining th2=new ThreadJoining();  
        ThreadJoining th3=new ThreadJoining(); 
        th1.start();
        th2.start();
        th3.start();
        th1.join();
        th2.join();
        th3.join();
        System.out.println("Threads exit");/*if we don't use join method in our program then
        then output will be Threads Started on first then Threads exit without done with thread
        implementation */

	}

}
