package VendingMachineDemo;

public interface VendingMachineFactory {
    Display createDisplay();
    CoinValidator createCoinValidator();
    ProductDispenser createProductDispenser();
}
