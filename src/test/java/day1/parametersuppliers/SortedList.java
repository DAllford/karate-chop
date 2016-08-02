package day1.parametersuppliers;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.PotentialAssignment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(SortedList.SortedListSupplier.class)
public @interface SortedList {

	int first();

	int last();

	int size();

	class SortedListSupplier extends ParameterSupplier {
		public List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) throws Throwable {
			SortedList annotation = parameterSignature.getAnnotation(SortedList.class);
			ArrayList<PotentialAssignment> list = new ArrayList<>();
			for (Integer i = 0; i <= annotation.size(); i++) {
				List<Integer> randomList = getRandomListForRange(annotation.first(), annotation.last());
				list.add(PotentialAssignment.forValue(randomList.toString(), randomList));
			}
			return list;
		}

		public List<Integer> getRandomListForRange(int first, int last) throws Throwable {
			ArrayList<Integer> list = new ArrayList<>();
			Random rand = new Random();
			for (Integer i = first; i <= last; i++) {
				if (rand.nextBoolean()) {
					list.add(i);
				}
			}
			return list;
		}
	}
}
