package chopper.day4;

import chopper.Chopper;
import chopper.ChopperParameterisedTests;
import chopper.day3.RecursiveRadialChopper;

import java.util.List;

/**
 * Created by danalford on 8/3/16.
 */
public class ChopperWithoutConditionalsParameterisedTests extends ChopperParameterisedTests{

	public ChopperWithoutConditionalsParameterisedTests(int expectedResult, int target, List<Integer> listToSearch) {
		super(expectedResult, target, listToSearch);
	}

	@Override
	protected Chopper getChopper() {
		return new RadialChopperWithoutConditionals();
	}
}
