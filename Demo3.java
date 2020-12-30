public class Demo3{
	/*
	* @author liyang
	* @version 1.0
	* @since 1.8
	*/
	public static void main(String[] args){
		/**
		* @author liyang
		* @param java_study
		*/
		int a = 10;
		int b = 20;
		a+=b; // a=a+b
		System.out.println(a);
		System.out.println(""+a+b);
		System.out.println(a+b+"");
		int score =80;
		String test= score < 60 ? "fuck" : "good";
		System.out.println(test);
		//javadoc -encoding UTF-8 -charset UTF-8 Demo3.java
	}
}