public class Array_a{
	public int a[] = null;
	public static void main(String[] args){
		Array_a aa = new Array_a();
		for(int i = 0; i < aa.setArray_a().length; i++){
			int[] a = aa.setArray_a();
			System.out.println("a[" + i +"]= " + a[i]);
		}
		System.out.println("a[]'s length is: " + aa.setArray_a().length);
	}
	public int[] setArray_a(){
		a = new int[5];
		for(int i = 0; i < a.length; i++){
			a[i] = i * 2 + 1;
		}
		return a;
	}

}
