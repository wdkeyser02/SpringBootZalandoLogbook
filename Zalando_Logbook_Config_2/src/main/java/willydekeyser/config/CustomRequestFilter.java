package willydekeyser.config;

import org.zalando.logbook.HttpRequest;
import org.zalando.logbook.RequestFilter;

public class CustomRequestFilter implements RequestFilter {

	@Override
	public HttpRequest filter(HttpRequest request) {
		return request;
	}

}
