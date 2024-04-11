package CoreJava;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		a[0] =1;
		a[1] = 4;
		a[2] = 9;
		a[3] = 7;
		a[4] = 12;
		System.out.println("Array length is");
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int b[] = {1,5,7,3,2};
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}

}
