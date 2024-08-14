package VendingMachineDemo;

public class ActiveProductDispenser implements ProductDispenser {

	@Override
	public void dispense(String product) {
		System.out.println(product + " is being dispensed.");
	}

}
