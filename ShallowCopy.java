public class ShallowCopy {
	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = a;
		a[3] = 7;
		System.out.println("old a reference: "+a);
		System.out.println("old b reference: "+b);
		System.out.println("old a.length: "+a.length);
		System.out.println("old fourth item of a: "+a[3]);
		System.out.println("old b.length: "+b.length);
		System.out.println("old fourth item of b: "+b[3]);

		a = new int[10];

		System.out.println("\nnew a reference: "+a);
		System.out.println("new b reference: "+b);
		System.out.println("new a.length: "+a.length);
		System.out.println("new fourth item of a: "+a[3]);
		System.out.println("new b.length: "+b.length);
		System.out.println("new fourth item of b: "+b[3]);
	}
}