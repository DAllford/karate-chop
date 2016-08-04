package chopper.day3;

import chopper.Chopper;
import chopper.ChopperTheoryTests;

/**
 * Created by danalford on 8/3/16.
 */
public class IterativeRadialChopperTheoryTests extends ChopperTheoryTests {
	@Override
	protected Chopper getChopper() {
		return new RecursiveRadialChopper();
	}
}
