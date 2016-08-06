package chopper.day4;

import chopper.Chopper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RadialChopperWithoutConditionals implements Chopper {

	@Override
	public int findInList(Integer target, List<Integer> originalData) {
		List<Integer> data = new ArrayList<>();
		data.addAll(originalData);


		Integer size = data.size();
		Integer centerIndex = size/2;
		Integer radiusSum = 0;

		List<Integer> radii = getListOfRadii(size);

		// Not executed in case of empty list
		for (Integer radius: radii) {
			Integer centerValue = data.get(centerIndex);
			radiusSum += target.compareTo(centerValue) * (radius+1)/2; // if target == centerValue no update occurs
			centerIndex = size/2 + radiusSum;
			centerIndex = Math.min(size-1, centerIndex);
		}


		//if we access this element it means we left the bounds of the array and so didnt find the target
		// (handles the case of the original list being empty).
		data.add(target+1);

		Integer centerValue = data.get(centerIndex);

		return centerIndex + Math.abs(target.compareTo(centerValue)) * (ABSENT_RETURN - centerIndex);
	}

	private List<Integer> getListOfRadii(Integer size) {
		return Stream.iterate(size/2, it -> it/2)
					.limit(size)
					.collect(Collectors.toList());
	}
}
