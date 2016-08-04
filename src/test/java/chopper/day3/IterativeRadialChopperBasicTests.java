package chopper.day3;

import chopper.Chopper;
import chopper.ChopperTests;

/**
 * Created by danalford on 8/3/16.
 */
public class IterativeRadialChopperBasicTests extends ChopperTests {
	@Override
	protected Chopper getChopper() {
		return new RecursiveRadialChopper();
	}
}
