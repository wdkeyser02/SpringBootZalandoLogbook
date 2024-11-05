package willydekeyser.config;

import org.zalando.logbook.HeaderFilter;
import org.zalando.logbook.HttpHeaders;

public class CustomHeaderFilter implements HeaderFilter {

	@Override
	public HttpHeaders filter(HttpHeaders headers) {
		return headers;
	}

}
