package VendingMachineDemo;

public class DisabledProductDispenser implements ProductDispenser {

	@Override
	public void dispense(String product) {
		System.out.println("Please insert a coin first.");
	}

}
