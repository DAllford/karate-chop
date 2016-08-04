package chopper.day2;

import chopper.Chopper;

import java.util.List;

/**
 * Created by danalford on 8/3/16.
 */
public class IterativeChopper implements Chopper {
	@Override
	public int findInList(Integer target, List<Integer> data) {
		int start = 0;
		int end = data.size() - 1; //both inclusive

		while(start <= end) {
			int midPointIndex = (start + end)/2;
			Integer midPointValue = data.get(midPointIndex);
			if(midPointValue.equals(target)) {
				return midPointIndex;
			} else if (midPointValue < target) {
				start = midPointIndex + 1;
			} else {
				end = midPointIndex - 1;
			}
		}
		return -1;
	}
}
