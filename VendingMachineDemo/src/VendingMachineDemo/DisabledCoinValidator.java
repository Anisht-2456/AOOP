package VendingMachineDemo;

public class DisabledCoinValidator implements CoinValidator {

	@Override
	public boolean validate(int coin) {
		return false;
	}

}
