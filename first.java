public class first {

    public static void main(String[] args) {
		System.out.println("Hercules");
	    if(n==2){
	    System.out.prinln("number is even");
	    }
	    else{
		    System.out.println("number is not even");
	    }

	}
}
class ThreadTest extends Thread
{
  public void run()
  {
    try
    {
      // Displaying the thread that is running
      System.out.println ("Thread " +
                Thread.currentThread().getId() +
                " is running");
 
    }
    catch (Exception e)
    {
      // Throwing an exception
      System.out.println ("Exception is caught");
    }
  }
}
 
// Main Class
public class Main
{
  public static void main(String[] args)
  {
    int n = 8;
    for (int i=0; i<n; i++)
    {
      ThreadTest object = new ThreadTest();
 
      // start() is replaced with run() for
      // seeing the purpose of start
      object.run();
    }
  }
}


class MyThread extends Thread {
	public void run()
	{
		System.out.println("Current thread name: "
						+ Thread.currentThread().getName());
		System.out.println("run() method called");
	}
}

class GeeksforGeeks {
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.start();
	}
}


