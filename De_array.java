package Double_ended_queue_using_array;

public class De_array {
		
	static final int max= 100;
	int arr[];
	int front;
	int rear;
	int size;
	public De_array(int size){
		arr = new int [max];
		front = -1;
		rear = 0;
		this.size = size;
	} 
	boolean isFull() {
		return((front == 0 && rear == size-1)|| front == rear+1);
	}
	boolean isEmpty() {
		return(front == -1);
	}
	void insfront(int key) {
		if (isFull()) {
			System.out.println("the array is full");
		}
		if (front == -1) {
			front = 0;
			rear = 0;
		}
		else if (front == 0) 
			front = size-1;
		else 
			front = front-1;
		arr[front] = key; 
	}
	void insrear(int key) {
		if (isFull()) {
			System.out.println("the array is full");
			return;
		}
		if (front == -1) {
			front = 0;
			rear = 0;
		}
		else if (rear == size-1)
			rear = 0;
		else 
			rear= rear+1;
		arr[rear] = key;
	}
	void delfront() {
		if (isEmpty()) {
			System.out.println("the array is empty");
			return;
		}
		if (front ==rear) {
			front = -1;
			rear = -1;
		}
		else if(front == size-1)
			front =0;
		else 
			front = front+1;
	}
	void deleterear()
    {
        if (isEmpty())
        {
            System.out.println("the array is empty");
            return ;
        }
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else if (rear == 0)
            rear = size-1;
        else
            rear = rear-1;
    }
	 int getFront()
	    {
	        if (isEmpty())
	        {
	            System.out.println(" the array is empty");
	            return -1 ;
	        }
	        return arr[front];
	    }
	    int getRear()
	    {
	        if(isEmpty() || rear < 0)
	        {
	            System.out.println("the array is empty");
	            return -1 ;
	        }
	        return arr[rear];
	    }
	
	public static void main(String[] args) {
		De_array ele =new De_array(5);
		ele.insfront(1);
		System.out.println("the array front element is" + ele.getFront());
		ele.insfront(2);
		System.out.println("the array front element is" + ele.getFront());
		ele.insrear(3);
		System.out.println("the elements in rear array are:" + ele.getRear());
		ele.insrear(4);
		System.out.println("the elements in rear array are:" + ele.getRear());
		ele.delfront();
		System.out.println("after the deletion of an element from front:" + ele.getFront());
		ele.deleterear();
		System.out.println("after the deletion of an element from rear:" + ele.getRear());


	}

}
