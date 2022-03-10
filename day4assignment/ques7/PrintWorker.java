package assignment.ques7;
public class PrintWorker implements Runnable {
	private Resource res;
	private String message;
	public PrintWorker(Resource res, String message) {
		this.res = res;
		this.message = message;
	}
	@Override
	public void run() {
		synchronized (res) {//synchronized statement by the help of this we will get required message properly
			res.printMessage(message);
		}
	}
}

