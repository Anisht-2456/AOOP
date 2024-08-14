package VendingMachineDemo;

public class ProductDispensedStateFactory implements VendingMachineFactory {
    @Override
    public Display createDisplay() {
        return new ProductDispensedDisplay();
    }

    @Override
    public CoinValidator createCoinValidator() {
        return new DisabledCoinValidator();
    }

    @Override
    public ProductDispenser createProductDispenser() {
        return new ActiveProductDispenser();
    }
}
