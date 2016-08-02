package day1.parametersuppliers;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.PotentialAssignment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(Between.BetweenSupplier.class)
public @interface Between {

	int first();

	int last();

	class BetweenSupplier extends ParameterSupplier {
		@Override
		public List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) throws Throwable {
			Between annotation = parameterSignature.getAnnotation(Between.class);
			ArrayList<PotentialAssignment> list = new ArrayList<>();
			for (Integer i = annotation.first(); i <= annotation.last(); i++) {
				list.add(PotentialAssignment.forValue(i.toString(), i));
			}
			return list;
		}
	}
}
