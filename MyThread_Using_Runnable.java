package dlmp;

class MyThreadRunnable1 implements Runnable{
	@Override
	public void run () {
		int i = 0;
		while(i<=5){
			System.out.println("this thread1 run using runnable ");	
			i++;
		}
	}
}

class MyThreadRunnable2 implements Runnable{
	@Override
	public void run () {
		int i = 0;
		while(i<=5){
			System.out.println("this thread2 run using runnable ");	
			i++;
		}
		
	}
}

public class MyThread_Using_Runnable {

	public static void main(String[] args) {
		MyThreadRunnable1 t1 = new MyThreadRunnable1();
		MyThreadRunnable2 t2 = new MyThreadRunnable2();
		t1.run();
		t2.run();
		

	}

}

