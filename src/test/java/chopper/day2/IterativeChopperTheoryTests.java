package chopper.day2;

import chopper.Chopper;
import chopper.ChopperTheoryTests;

/**
 * Created by danalford on 8/3/16.
 */
public class IterativeChopperTheoryTests extends ChopperTheoryTests {
	@Override
	protected Chopper getChopper() {
		return new IterativeChopper();
	}
}
