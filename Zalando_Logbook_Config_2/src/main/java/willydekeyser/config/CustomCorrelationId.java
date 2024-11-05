package willydekeyser.config;

import org.zalando.logbook.CorrelationId;
import org.zalando.logbook.HttpRequest;

public class CustomCorrelationId implements CorrelationId {

	@Override
	public String generate(HttpRequest request) {
		return "My Spring Boot";
	}

}
