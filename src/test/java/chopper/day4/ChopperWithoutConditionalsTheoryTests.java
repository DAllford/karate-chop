package chopper.day4;

import chopper.Chopper;
import chopper.ChopperTheoryTests;
import chopper.day3.RecursiveRadialChopper;

/**
 * Created by danalford on 8/3/16.
 */
public class ChopperWithoutConditionalsTheoryTests extends ChopperTheoryTests {
	@Override
	protected Chopper getChopper() {
		return new RadialChopperWithoutConditionals();
	}
}
