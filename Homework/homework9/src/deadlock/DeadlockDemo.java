package deadlock;

import potik.Main;

public class DeadlockDemo {
public final static Object first = new Object();
public final static Object main = new Main();

public static void main(String s[]) {
   Thread t1 = new Thread() {
   public void run() {
      synchronized (first) {
         Thread.yield();
    	 	
         synchronized (main) {
        	
            System.out.println("Success!");
            
   } 
         }
      } 
   };
	t1.start();

	}
	}

