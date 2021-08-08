
public class Thread3 extends Thread
{
	public void run()
	{
		System.out.println("Thread is running...");
	}

    public static void main(String[] args)
    {
      Thread3 t1=new Thread3();
      t1.start();
  
    }

}
