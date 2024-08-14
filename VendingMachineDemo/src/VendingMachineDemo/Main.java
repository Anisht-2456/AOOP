package VendingMachineDemo;

public class Main {

	public static void main(String[] args) {
		VendingMachineFactory idleFactory = new IdleStateFactory();
        VendingMachine vendingMachine = new VendingMachine(idleFactory);

        vendingMachine.insertCoin(10); // Insert coin and switch to Coin Inserted State
        vendingMachine.selectProduct("Soda"); // Select a product, dispense it

        vendingMachine.reset(); // Reset the machine to Idle State

	}

}
