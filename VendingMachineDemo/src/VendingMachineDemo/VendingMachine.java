package VendingMachineDemo;

public class VendingMachine {
    private VendingMachineFactory factory;
    private int credit = 0;

    public VendingMachine(VendingMachineFactory factory) {
        this.factory = factory;
    }

    public void insertCoin(int coin) {
        CoinValidator validator = factory.createCoinValidator();
        if (validator.validate(coin)) {
            credit += coin;
            System.out.println("Coin accepted. Current credit: " + credit);
            this.factory = new CoinInsertedStateFactory();
        } 
        else {
            System.out.println("Invalid coin.");
        }
    }

    public void selectProduct(String product) {
        Display display = factory.createDisplay();
        display.show();
        
        ProductDispenser dispenser = factory.createProductDispenser();
        if (credit > 0) {
            dispenser.dispense(product);
            credit = 0;
            this.factory = new ProductDispensedStateFactory();
        } 
        else {
            System.out.println("Insufficient credit.");
        }
    }

    public void reset() {
        this.factory = new IdleStateFactory();
        credit = 0;
    }
}
