package chopper.day2;

import chopper.Chopper;
import chopper.ChopperParameterisedTests;

import java.util.List;

/**
 * Created by danalford on 8/3/16.
 */
public class IterativeChopperParameterisedTests extends ChopperParameterisedTests{

	public IterativeChopperParameterisedTests(int expectedResult, int target, List<Integer> listToSearch) {
		super(expectedResult, target, listToSearch);
	}

	@Override
	protected Chopper getChopper() {
		return new IterativeChopper();
	}
}
