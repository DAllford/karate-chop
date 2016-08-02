package day1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ChopperParameterisedTests {

	private int expectedResult;
	private int target;
	private List<Integer> listToSearch;

	public ChopperParameterisedTests(int expectedResult, int target, List<Integer> listToSearch) {
		this.expectedResult = expectedResult;
		this.target = target;
		this.listToSearch = listToSearch;
	}

	@Parameterized.Parameters(name = "{index}: chop({1}, {2})={0}")
	public static Collection binaryChopData() {
		return Arrays.asList(new Object[][] {
				{ -1, 1, Collections.EMPTY_LIST},
				{ -1, 1, Collections.singletonList(4)},
				{ -1, 12, Arrays.asList(10, 20)},
				{ -1, 12, Arrays.asList(10, 11)},
				{ -1, 12, Arrays.asList(20, 30)},
				{ 1, 12, Arrays.asList(10, 12)},
				{ 0, 12, Arrays.asList(12, 20)},

				{ 1, 12, Arrays.asList(10, 12, 20)},
				{ 0, 12, Arrays.asList(12, 15, 20)},
				{ 2, 12, Arrays.asList(1, 11, 12)},

				{4, 19, Arrays.asList(-2, -1, 3, 5, 19, 20, 23, 30, 40, 180, 999)}

		});
	}

	@Test
	public void binaryChopChecker () {
		assertEquals(expectedResult, Chopper.chop(target, listToSearch));
	}

}
