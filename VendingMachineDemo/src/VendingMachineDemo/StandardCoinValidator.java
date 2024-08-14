package VendingMachineDemo;

public class StandardCoinValidator implements CoinValidator {

	@Override
	public boolean validate(int coin) {
		return coin == 1 || coin == 5 || coin == 10 || coin == 25;
	}

}
