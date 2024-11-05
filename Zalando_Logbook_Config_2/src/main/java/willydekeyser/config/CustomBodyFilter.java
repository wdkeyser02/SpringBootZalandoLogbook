package willydekeyser.config;

import org.zalando.logbook.BodyFilter;

public class CustomBodyFilter implements BodyFilter {

	@Override
	public String filter(String contentType, String body) {
		return body;
	}

}
