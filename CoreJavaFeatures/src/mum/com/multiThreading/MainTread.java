package mum.com.multiThreading;

import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class MainTread extends Thread {
	private String paramenter;

	public MainTread(String parameter) {
		this.paramenter = parameter;
	}

	@Override
	public void run() {

		try {
			while (true) {

				System.out.println(
						"this is the main thread running || name :" + this.getName() + " || ID :: " + this.getId() +" || parameter ::"+paramenter);
				TimeUnit.SECONDS.sleep(1);
			}
		} catch (Exception e) {
			//this.currentThread().interrupt();
			 System.out.println(this.paramenter +" was interrupted currentThread().isInterrupted() ::--> "+this.currentThread().isInterrupted() );
		}
		
		//System.out.println("is this a daemon ? ::" + isDaemon());
	}

	 
	public String getParamenter() {
		return paramenter;
	}

	public void setParamenter(String paramenter) {
		this.paramenter = paramenter;
	}
	
	public static void main(String...remy) {
		
		
	 
		ExecutorService pool = Executors.newCachedThreadPool();
	  
		String []names = {"remy","yvon","hagenimana"};
		
		for (int i=0; i<names.length ;i++ ) {
			pool.execute(new MainTread(names[i]));
		}
	
		System.out.println("before interupt isShutDOwn() :: "+pool.isShutdown() +" , Is Termineted isTerminated() ::"+pool.isTerminated());
		pool.shutdown();
	//	pool.execute(new MainTread("four"));
	//	System.out.println("rejected four thread after shutdown");
		System.out.println("after interupt isShutDOwn() :: "+pool.isShutdown() +" , Is Termineted isTerminated() ::"+pool.isTerminated());

try {
	

	
	long timeout = 100;
	 TimeUnit unit = TimeUnit.MILLISECONDS;
	 
		System.out.println("waiting for all threads for completion for "+timeout+ " -- "+unit) ;
		
		boolean isTerminated = pool.awaitTermination(timeout, unit);
		System.out.println("is terminated :: -->"+isTerminated);
		
		if(!isTerminated) {
			System.out.println("calling shuttdownNow ....");
			List<Runnable> list = pool.shutdownNow();
			System.out.println("List of threads is :: "+list.size());
			isTerminated = pool.awaitTermination(timeout, unit);
			System.out.println("is terminated :: -->"+isTerminated);
			
			if (!isTerminated) {
				System.out.println("Some threads are still running");
			}
			System.out.println("Exiting....");
			
			
		}

	
		} catch (Exception e) {
			System.out.println("Error happened --::--"+ e.getMessage());
			e.printStackTrace();
	
}
		
		
		/**
		MainTread th1 = new MainTread("One");
		th1.start();
		MainTread th2 = new MainTread("Two");
		th2.setDaemon(true);
		th2.start();
		pauseOneSecond();
		th1.setParamenter("exit");
		pauseOneSecond();
		System.out.println("the main thread has exited");
		*/
		
	}

}
