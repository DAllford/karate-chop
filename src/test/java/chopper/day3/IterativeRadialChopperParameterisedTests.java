package chopper.day3;

import chopper.Chopper;
import chopper.ChopperParameterisedTests;

import java.util.List;

/**
 * Created by danalford on 8/3/16.
 */
public class IterativeRadialChopperParameterisedTests extends ChopperParameterisedTests{

	public IterativeRadialChopperParameterisedTests(int expectedResult, int target, List<Integer> listToSearch) {
		super(expectedResult, target, listToSearch);
	}

	@Override
	protected Chopper getChopper() {
		return new RecursiveRadialChopper();
	}
}
