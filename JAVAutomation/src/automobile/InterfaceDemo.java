package automobile;

public class InterfaceDemo implements InterfaceCars, InterfaceBMWCars {

	@Override
	public void engineStart(String engineType, boolean isKeyLess) {
		System.out.println("This is the implementation");
	}

	@Override
	public void headsUpNavigation() {
		System.out.println("This is the headsup navigation");
	}

}
