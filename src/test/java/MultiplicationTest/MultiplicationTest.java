package MultiplicationTest;

import org.junit.Assert;
import org.junit.Test;

import com.bae.calc.Calculator;

public class MultiplicationTest {

	@Test
	public void multiplyTest() {
		Calculator calc = new Calculator();
		String multiplyResult1 = calc.multiply(0,0);
		String multiplyResult2 = calc.multiply(25,67);
		String multiplyResult3 = calc.multiply(-12,-45);
		String multiplyResult4 = calc.multiply(23,-4);
		
		Assert.assertEquals ("The answer is 0", multiplyResult1);
		Assert.assertEquals ("The answer is 1675", multiplyResult2);
		Assert.assertEquals ("The answer is 540", multiplyResult3);
		Assert.assertEquals ("The answer is -92", multiplyResult4);
	}

}
