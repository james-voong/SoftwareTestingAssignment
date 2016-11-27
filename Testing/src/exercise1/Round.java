package exercise1;

import java.math.BigDecimal;

public class Round {

	public static int roundHalfDown(Double number) {

		// Error is here. Should be BigDecimal.ROUND_HALF_DOWN
		return (int) DecimalPrecision.setDecimalsPrecision(number, 0, BigDecimal.ROUND_HALF_UP);
	}

}
