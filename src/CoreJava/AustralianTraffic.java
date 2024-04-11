package CoreJava;

import Demo.ContinentalTraffic;
import Demo.centralTraffic;

public class AustralianTraffic implements centralTraffic,ContinentalTraffic{
	public static void main(String[] args)
	{
		centralTraffic a = new AustralianTraffic();
		a.RedStop();
		a.GreenGo();
		a.YellowSlow();
		ContinentalTraffic ct = new AustralianTraffic();
		ct.trainSymbol();
	}
	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("GreenGo implementation");
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("RedStop implementation");
	}

	@Override
	public void YellowSlow() {
		// TODO Auto-generated method stub
		System.out.println("YellowSlow implementation");
	}
	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train is coming");
	}

}
