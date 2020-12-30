public class Demo2 {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;

		System.out.println("a && b: "+(a&&b)); // 逻辑与
		System.out.println("a || b: "+(a||b)); // 逻辑或
		System.out.println("!(a && b): "+!(a&&b)); // 逻辑非

		int c = 5;
		boolean d = (c<4)&&(c++<4); //短路运算
		System.out.println(d);
		System.out.println(c);
		System.out.println(2<<3); //位运算2*2*2
		System.out.println(24>>2); //位运算24/2/2
	}
}