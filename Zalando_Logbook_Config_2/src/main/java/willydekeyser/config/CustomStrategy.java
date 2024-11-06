package willydekeyser.config;

import java.io.IOException;

import org.zalando.logbook.HttpRequest;
import org.zalando.logbook.HttpResponse;
import org.zalando.logbook.Strategy;

public class CustomStrategy implements Strategy {

	@Override
	public HttpRequest process(HttpRequest request) throws IOException {
		return request.withBody();
	}

	@Override
	public HttpResponse process(HttpRequest request, HttpResponse response) throws IOException {
		return response.withBody();
	}

}
