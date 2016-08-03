package chopper.day2;

import chopper.Chopper;
import chopper.ChopperTests;

/**
 * Created by danalford on 8/3/16.
 */
public class IterativeChopperBasicTests extends ChopperTests {
	@Override
	protected Chopper getChopper() {
		return new IterativeChopper();
	}
}
