package MultiplicationTest;

import org.junit.Assert;
import org.junit.Test;
import com.bae.calc.MultiplyCalc;

public class MultiplicationTest {

	@Test
	public void multiplyTest() {
		MultiplyCalc calc = new MultiplyCalc();
		String multiplyResult1 = calc.multiply(0,0);
		String multiplyResult2 = calc.multiply(25,67);
		String multiplyResult3 = calc.multiply(-12,-45);
		String multiplyResult4 = calc.multiply(23,-4);
		String multiplyResult5 = calc.multiply(0, 25);
		String multiplyResult6 = calc.multiply(-0, -0);
		
		Assert.assertEquals ("The answer is 0", multiplyResult1);
		Assert.assertEquals ("The answer is 1675", multiplyResult2);
		Assert.assertEquals ("The answer is 540", multiplyResult3);
		Assert.assertEquals ("The answer is -92", multiplyResult4);
		Assert.assertEquals ("The answer is 0", multiplyResult5);
		Assert.assertEquals ("The answer is 0", multiplyResult6);
	}
}
