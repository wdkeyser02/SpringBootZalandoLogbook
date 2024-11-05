package willydekeyser.config;

import org.zalando.logbook.HttpResponse;
import org.zalando.logbook.ResponseFilter;

public class CustomResponseFilter implements ResponseFilter {

	@Override
	public HttpResponse filter(HttpResponse response) {
		return response;
	}

}
