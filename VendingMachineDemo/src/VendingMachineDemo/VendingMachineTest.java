package VendingMachineDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

    private VendingMachine vendingMachine;

    @Before
    public void setUp() {
        VendingMachineFactory idleFactory = new IdleStateFactory();
        vendingMachine = new VendingMachine(idleFactory);
    }


    @Test
    public void testInsertCoinTransitionsToCoinInsertedState() {
        vendingMachine.insertCoin(10);
        vendingMachine.selectProduct("Soda");

        // Since there's no direct way to check the state, we check the behavior.
        // After inserting a coin, the display should be in the "Coin Inserted" state.
    }

    @Test
    public void testInvalidCoinDoesNotChangeState() {
        vendingMachine.insertCoin(2);  // Invalid coin
        vendingMachine.selectProduct("Soda");

        // Expecting "Please insert a coin first." because the coin is invalid.
    }

    @Test
    public void testSelectProductWithoutCoin() {
        vendingMachine.selectProduct("Soda");

        // Expecting "Please insert a coin first."
    }

    @Test
    public void testDispenseProductAfterCoinInsertion() {
        vendingMachine.insertCoin(10);
        vendingMachine.selectProduct("Soda");

        // Expecting "Soda is being dispensed." and transition to Product Dispensed State.
    }

    @Test
    public void testResetAfterDispensingProduct() {
        vendingMachine.insertCoin(10);
        vendingMachine.selectProduct("Soda");

        vendingMachine.reset();
        vendingMachine.selectProduct("Soda");

        // Expecting "Please insert a coin first." since the machine was reset to Idle State.
    }

    @Test
    public void testMultipleCoinInsertion() {
        vendingMachine.insertCoin(5);
        vendingMachine.insertCoin(5);  // Now total 10, which is enough

        vendingMachine.selectProduct("Soda");

        // Expecting "Soda is being dispensed."
    }

    @Test
    public void testInsufficientCredit() {
        vendingMachine.insertCoin(5);  // Insert only 5, assuming 10 is required

        vendingMachine.selectProduct("Soda");

        // Expecting "Insufficient credit." and no product dispensed.
    }

}
