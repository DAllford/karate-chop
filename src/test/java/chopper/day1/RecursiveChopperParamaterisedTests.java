package chopper.day1;

import chopper.Chopper;
import chopper.ChopperParameterisedTests;

import java.util.List;

/**
 * Created by danalford on 8/3/16.
 */
public class RecursiveChopperParamaterisedTests extends ChopperParameterisedTests {

	@Override
	protected Chopper getChopper() {
		return new RecursiveChopper();
	}

	public RecursiveChopperParamaterisedTests(int expectedResult, int target, List<Integer> listToSearch) {
		super(expectedResult, target, listToSearch);
	}
}
