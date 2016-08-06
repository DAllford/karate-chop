package chopper.day1;

import chopper.Chopper;

import java.util.List;

public class RecursiveChopper implements Chopper {
	public int findInList(Integer target, List<Integer> data) {
		return findInListWithAccumulator(target, data, 0);
	}

	private Integer findInListWithAccumulator(final Integer target, final List<Integer> data, final int startingIndex) {
		if(data.size() > 0){
			final Integer midPointIndex = data.size()/2;
			final Integer midPointValue = data.get(midPointIndex);
			if(midPointValue.equals(target)) {
				return midPointIndex + startingIndex;
			} else {
				return midPointValue > target ?
						findInListWithAccumulator(target, leftSideOfPointMidPoint(data, midPointIndex), startingIndex) :
						findInListWithAccumulator(target, rightSideOfPointMidPoint(data, midPointIndex), startingIndex+midPointIndex+1);
			}
		}
		return ABSENT_RETURN;
	}

	private List<Integer> leftSideOfPointMidPoint(List<Integer> data, int midPointIndex) {
		return data.subList(0, midPointIndex);
	}

	private List<Integer> rightSideOfPointMidPoint(List<Integer> data, int midPointIndex) {
		return data.subList(midPointIndex + 1, data.size());
	}
}
