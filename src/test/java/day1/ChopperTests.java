package day1;

import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class ChopperTests {

	@Test
	public void chop_ofEmptyArray_shouldReturnNegative1 () {
		assertEquals(-1, Chopper.chop(5, Collections.<Integer>emptyList()));
	}

	@Test
	public void chop_ofSingleIntList_ContainingTheValueItIsSearchingFor_shouldReturn0 () {
		assertEquals(0, Chopper.chop(10, singletonList(10)));
	}

	@Test
	public void chop_ofSingleIntList_ContainingDifferentValueToWhatItIsSearchingFor_shouldReturnNegative1 () {
		assertEquals(-1, Chopper.chop(12, singletonList(10)));
	}

	@Test
	public void chop_ofTwoIntList_ContainingValueItIsSearchingForInSecondPlace_shouldReturn1 () {
		assertEquals(1, Chopper.chop(12, asList(10, 12)));
	}

	@Test
	public void chop_ofTwoIntList_ContainingValueItIsSearchingForInFirstPlace_shouldReturn0 () {
		assertEquals(0, Chopper.chop(10, asList(10, 12)));
	}

	@Test
	public void chop_edgeCaseICantName () {
		assertEquals(-1, Chopper.chop(10, singletonList(4)));
	}
}
