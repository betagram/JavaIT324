public class StringClass_3{
	public static void main(String[] args){
		String str = "this is a dog !";
		String[] sArry = str.split(" ");
		System.out.println("sArry's length is: " + sArry.length);
		for(int i = 0; i < sArry.length; i++){
			System.out.println(sArry[i]);
		}
	
	}
}
