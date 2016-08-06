package chopper.day4;

import chopper.Chopper;
import chopper.ChopperTests;
import chopper.day3.RecursiveRadialChopper;

public class ChopperWithoutConditionalsBasicTests extends ChopperTests {
	@Override
	protected Chopper getChopper() {
		return new RadialChopperWithoutConditionals();
	}
}
