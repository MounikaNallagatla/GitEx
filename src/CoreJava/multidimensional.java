package CoreJava;

public class multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		System.out.println(a[1][0]);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
	}

}
