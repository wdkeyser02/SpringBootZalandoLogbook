package willydekeyser.config;

import org.zalando.logbook.PathFilter;

public class CustomPathFilter implements PathFilter {

	@Override
	public String filter(String path) {
		return "Test ";
	}

}
