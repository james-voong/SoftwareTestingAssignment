package week1.TestingTerminology;

import java.math.BigDecimal;

/**
 * 
 * @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
 *
 */
public class DecimalPrecision {

	static public double setDecimalsPrecision(Double number, int numberOfDecimals, int upOrDown) {

		BigDecimal bigDecimal = new BigDecimal(number);

		BigDecimal rounded = bigDecimal.setScale(numberOfDecimals, upOrDown);

		double newNumber = rounded.doubleValue();

		/*
		 * while( newNumber == 0.0 ){
		 * 
		 * bigDecimal = new BigDecimal( number );
		 * 
		 * rounded = bigDecimal.setScale( ++numberOfDecimals, upOrDown );
		 * 
		 * newNumber = rounded.doubleValue(); //PrintMessages.print(
		 * "[DecimalPrecision:setDecimalsPrecision] Init number = " + number +
		 * ", newNumber = " + newNumber ); }
		 */

		return newNumber;
	}

}
