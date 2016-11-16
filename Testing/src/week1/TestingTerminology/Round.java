package week1.TestingTerminology;

import java.math.BigDecimal;

public class Round {

	public static int roundHalfDown(Double number) {
		return (int) DecimalPrecision.setDecimalsPrecision(number, 0, BigDecimal.ROUND_HALF_UP);
	}

}
