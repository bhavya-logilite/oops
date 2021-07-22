package bhavya;
abstract class Animal {
	  public abstract void animalSound();
	  public void sleep() {
	    System.out.println("sound of sleep : Zzz");
	  }
	}

	class Pig extends Animal {
	  public void animalSound() {
	    System.out.println("The cat says: meow meow");
	  }
	}

public class Main
{

	public static void main(String[] args)
	{
		Pig myPig = new Pig(); 
	    myPig.animalSound();
	    myPig.sleep();
	}

}
