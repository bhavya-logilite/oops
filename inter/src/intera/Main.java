package intera;
interface cars{
	public void carsound();
    public void horn();
}
 class ferrari implements cars{
  public void carsound() {
	  System.out.println("the car sound is: zoom");
  }
  public void horn() {
	  System.out.println("the car horn sound is: peep");
  }
  
	  }

public class Main
{

public static void main(String[] args){
    ferrari mycar= new ferrari();
    mycar.carsound();
    mycar.horn();
}
}