package dlmp;
class Thread1 extends Thread{
	@Override
	public void run() {
		int i = 0;
		while(i<=5) {
			System.out.println("the thread is working for first time"); 
			i++;
		}
	}
}
class Thread2 extends Thread{
	@Override
	public void run() {
		int i = 0;
		while(i<5) {
			System.out.println("the thread is working for second time"); 
			i++;
		}
	}
}

public class MyThread {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();

	}

}
