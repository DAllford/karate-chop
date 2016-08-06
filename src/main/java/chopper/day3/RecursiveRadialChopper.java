package chopper.day3;

import chopper.Chopper;

import java.util.List;

/**
 * Created by danalford on 8/4/16.
 */
public class RecursiveRadialChopper implements Chopper {

	@Override
	public int findInList(Integer target, List<Integer> data) {
		if(data.size() == 0 ) {
			return ABSENT_RETURN;
		}
		return findInList(target, data, data.size()/2, data.size()/2);
	}

	private int findInList(Integer target, List<Integer> data, Integer centerIndex, Integer radius) {
		if (centerIndex >= data.size()) {
			return ABSENT_RETURN;
		}
		Integer centerValue = data.get(centerIndex);
		if (centerValue.equals(target)){
			return centerIndex;
		}
		if(radius.equals(0)) {
			return ABSENT_RETURN;
		}
		else {
			Integer newCenter = centerValue < target ?
					centerIndex + (1+radius)/2 : centerIndex - (1+radius)/2; //ensure if there is a larger side (number of squares unchecked is even) then we have the extra square on the left.
			Integer newRadius = radius/2;
			return findInList(target, data, newCenter, newRadius);
		}
	}
}
