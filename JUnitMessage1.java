package junti_tester;

public class JUnitMessage1 {
		private  String message;
		public JUnitMessage1(String message) {
			this.message = message;
		}
	public  void printMessage(){
		System.out.println(message); 
		int divide=1/0;
	}
	public String printHiMessage(){ 
		message="Hi!" + message;
		System.out.println(message);
		return message;
	}
}
