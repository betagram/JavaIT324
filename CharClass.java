public class CharClass{
	public static void main(String[] args){
		SubThread s1 = new SubThread();
		SubThread s2 = new SubThread();
		SubThread s3 = new SubThread();
		s1.start();
		s2.start();
		s3.start();
	}
	static class SubThread extends Thread{
		public void run(){
			sleep(100);
			System.out.println(Thread.currentThread().getName() + "!");
		}
	}
}
