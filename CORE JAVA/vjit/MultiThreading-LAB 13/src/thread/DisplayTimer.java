package thread;

import java.util.Date;
import java.util.Timer;

public class DisplayTimer implements Runnable {
	@Override
	public void run() 
	{
		System.out.println("Timer task started at:" + new Date());
		completeTask();
		System.out.println("Timer task finished at:" + new Date());
	}
	private void completeTask()
	{
		try 
		{ // assuming it takes 10 secs to complete the task
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		  {
			e.printStackTrace();
		  }
	}
	public static void main(String args[])
	{
        DisplayTimer dt = new DisplayTimer();
		/*
		 * //running timer task as daemon thread // Timer timer = new Timer(true); //
		 * timer.scheduleAtFixedRate(timerTask, 0, 10*1000); //
		 * System.out.println("TimerTask started");
		 */     
        System.out.println("DisplayTimer started"); 
        Thread t = new Thread(dt);
  	    t.start();
        //cancel after sometime
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) {
		 * e.printStackTrace(); } timer.cancel();
		 */       
        try
        {
            Thread.sleep(15000);
        }  
        catch (InterruptedException e)
        {
           e.printStackTrace();
        }
        System.out.println("DisplayTimer cancelled");
    }
}
	