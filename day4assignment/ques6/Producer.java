package assignment.ques6;
public class Producer extends Thread {
    StringBuffer buffer;
    boolean dp = false;
    Producer()
    {
        buffer = new StringBuffer(4);
    }
    public void run()
    {
        synchronized (buffer)
        {
            for (int i = 0; i < 4; i++) {
                try {
                    buffer.append(i);
                    System.out.println("Produced " + i);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Buffer is FUll");
            buffer.notify();
        }
    }
}