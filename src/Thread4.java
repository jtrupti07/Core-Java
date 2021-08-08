
class Thread4 implements Runnable
   {
	public void run()
	{
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		Thread4 t1=new Thread4();
		Thread T=new Thread(t1);
		System.out.println("Name of thread is: "+T.getName());
		System.out.println("ID of thread T is : "+T.getId());
		T.start();	
		T.setName("ThreadT");
		System.out.println("After changing name of t1: "+T.getName());

	}

}
