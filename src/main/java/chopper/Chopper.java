package chopper;

import java.util.List;

/**
 * Created by danalford on 8/3/16.
 */
public interface Chopper {

	int ABSENT_RETURN = -1;


	int findInList(Integer target, List<Integer> data);
}
