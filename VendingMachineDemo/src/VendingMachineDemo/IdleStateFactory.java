package VendingMachineDemo;

public class IdleStateFactory implements VendingMachineFactory {
    @Override
    public Display createDisplay() {
        return new IdleDisplay();
    }

    @Override
    public CoinValidator createCoinValidator() {
        return new StandardCoinValidator();
    }

    @Override
    public ProductDispenser createProductDispenser() {
        return new DisabledProductDispenser();
    }
}
