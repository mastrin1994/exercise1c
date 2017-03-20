package wdsr.exercise1.conversions;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayConverter {
	
	private static final Logger log = LogManager.getLogger();
	
    public int[] convertToInts(String[] strings) {
		log.debug("convertToInts entered [strings]", Arrays.toString(strings));
        log.info("convertToInts entered [strings]=" + Arrays.toString(strings));
		log.info("convertToInts exiting=" + Arrays.toString(Arrays.stream(strings).mapToInt(Integer::valueOf).toArray()));
		log.debug("convertToInts exiting", Arrays.stream(strings).mapToInt(Integer::valueOf).toArray());
		return Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
    }
}
