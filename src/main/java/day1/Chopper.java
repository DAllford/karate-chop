package day1;

import java.util.List;

/**
 * Created by danalford on 8/2/16.
 */
public class Chopper {

	public static int chop(Integer target, List<Integer> data) {
		return chop(target, data, 0);
	}

	public static int chop(Integer target, List<Integer> data, int startingPoint) {
		if(data.size() > 0){
			int midPoint = data.size()/2;
			Integer guess = data.get(midPoint);
			if(guess.equals(target)) {
				return midPoint + startingPoint;
			} else if(guess > target) {
				return chop (target, data.subList(0, midPoint), startingPoint);
			} else {
				return chop (target, data.subList(midPoint + 1, data.size()), startingPoint+midPoint+1);
			}
		}
		return -1;
	}
}
