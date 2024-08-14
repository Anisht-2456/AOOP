package VendingMachineDemo;

public class CoinInsertedStateFactory implements VendingMachineFactory {
    @Override
    public Display createDisplay() {
        return new CoinInsertedDisplay();
    }

    @Override
    public CoinValidator createCoinValidator() {
        return new StandardCoinValidator();
    }

    @Override
    public ProductDispenser createProductDispenser() {
        return new ActiveProductDispenser();
    }
}
