public class ThrowDemo extends Throw{
	void myThow(){
		try{
			myThow(7,0);
		}catch(ArithmeticException e){
			System.out.println();
		}
		throw new RuntimeException("Run time exception.");
	}
	public static void main(String[] args){
		new ThrowDemo().myThow();
	}
}
class Throw{
	void myThow(){
		mythow_1(3,6);
	}
	int myThow_1(int x, int y) throws ArithmeticException{
		return x / y;
	}
}
