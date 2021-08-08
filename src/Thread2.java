class Marvellous
{
	synchronized public void Display(String str)
	{
		System.out.println("{ "+str);
		try {
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println(" }");
		}
	}
}

class MultiTh extends Thread
{
	String Message;
	Marvellous obj;
	public MultiTh(Marvellous ref,String str)
	{
		this.obj=ref;
		this.Message=str;
	}
	public void run()
	{
		obj.Display(Message);
	}
}


public class Thread2 {

	public static void main(String[] args) {
		System.out.println("Inside Main Thread");
		Marvellous mobj=new Marvellous();
		
		 MultiTh obj1=new MultiTh(mobj,"Trupti Vilas Jadhav");
		 
		 MultiTh obj2=new MultiTh(mobj,"Baramati");
		 
		 MultiTh obj3=new MultiTh(mobj,"413102");
		 
		 obj1.start();
		 obj2.start();
		 obj3.start();
		
		System.out.println("End of main Thread");

	}

}
