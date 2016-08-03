package chopper.day1;

import chopper.Chopper;
import chopper.ChopperTheoryTests;

/**
 * Created by danalford on 8/3/16.
 */
public class RecursiveChopperTheoryTests extends ChopperTheoryTests{
	@Override
	protected Chopper getChopper() {
		return new RecursiveChopper();
	}
}
