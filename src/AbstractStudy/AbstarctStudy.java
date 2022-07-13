package AbstractStudy;

public class AbstarctStudy extends Abstarct2{

	public static void main(String[] args) 
	{
		AbstarctStudy obj = new AbstarctStudy();
		obj.ak();
		obj.ak1();
		obj.ak2();
		obj.ak3();
		obj.ak4();

	}

	@Override
	public void ak3() {
		// TODO Auto-generated method stub
		System.out.println("D");
	}

	@Override
	public void ak4() {
		// TODO Auto-generated method stub
		System.out.println("E");
	}

	@Override
	public void ak() {
		// TODO Auto-generated method stub
		System.out.println("A");
	}

	@Override
	public void ak1() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}

	@Override
	public void ak2() {
		// TODO Auto-generated method stub
		System.out.println("C");
	}

}
