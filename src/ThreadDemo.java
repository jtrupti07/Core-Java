class DemoThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}



public class ThreadDemo  {

	public static void main(String[] args) throws Exception  {
	System.out.println("Inside Main Thread");
	Thread T1=new Thread(new DemoThread());
	Thread T2=new Thread(new DemoThread());
	T1.start();//to start the execution of thread
	T1.join(); // It waits for thread to die
	T2.start();
	T2.join();
	System.out.println("End of main Thread");

	}

}
