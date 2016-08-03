package chopper;

import chopper.parametersuppliers.Between;
import chopper.parametersuppliers.SortedList;
import chopper.day1.RecursiveChopper;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeThat;

@RunWith(Theories.class)
public abstract class ChopperTheoryTests {

	private Chopper chopper = getChopper();

	protected abstract Chopper getChopper();


	@Theory
	public void chopOfASortedList_whenAnElementIsNotContainedInTheList_ShouldReturnNegative1 (
			@Between(first = -500, last = 500) Integer target, @SortedList(first=-500, last=500, size=50) List<Integer> list) {
		assumeThat(list.contains(target), is(false));
		assertEquals(-1, chopper.findInList(target, list));
	}

	@Theory
	public void chopOfASortedList_whenAnElementIsContainedInTheList_ShouldReturnPositionOfThatElement (
			@Between(first = -500, last = 500) Integer target, @SortedList(first=-500, last=500, size=50) List<Integer> list) {
		assumeThat(list.contains(target), is(true));
		assertEquals(target, list.get(chopper.findInList(target, list)));
	}

}
