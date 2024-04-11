package CoreJava;

public class childClass extends ParentClass{
	
	public void engine()
	{
		System.out.println("engine code is implemented");
		System.out.println("engine code is started");
		System.out.println("engine code is started");
		// abc
		//def
		//ghi
		System.out.println("engine code is implemented");
		System.out.println("engine code is started");
		System.out.println("engine code is started");
		
	}
	public void color()
	{
		System.out.println(color);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClass cc = new childClass();
		cc.engine();
		cc.color();
		cc.audisSystem();
		cc.brakes();
		cc.gears();
	}

}
