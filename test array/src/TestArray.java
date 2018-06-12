import java.util.Date;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] a = new int[]{ 17, 19, 23, 29, 31, 37 };

		int a[]= {213123,54214,1321};
		int[] b = a;
		for (int i : b) {
			System.out.println(i);
		}
		
		a[1]=0;
		System.out.println("---------------");
		for (int i : b) {
			System.out.println(i);
		}
		
		System.out.println(new Date());



	}

}
