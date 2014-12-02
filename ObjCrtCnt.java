public class ObjCrtCnt{
	public static void main(String[] args){
		String str = new String("good");
		String str1 = "good";
		String str2 = new String("good");
		System.out.println(str == str1);
		System.out.println(str.equals(str2));
		System.out.println(str2 == str1);
	}
}
