package chopper.day1;

import chopper.Chopper;
import chopper.ChopperTests;

/**
 * Created by danalford on 8/3/16.
 */
public class RecursiveChopperBasicTests extends ChopperTests {

	@Override
	protected Chopper getChopper() {
		return new RecursiveChopper();
	}
}
