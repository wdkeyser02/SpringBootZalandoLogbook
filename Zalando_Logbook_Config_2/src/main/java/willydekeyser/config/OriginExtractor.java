package willydekeyser.config;

import org.zalando.logbook.HttpRequest;
import org.zalando.logbook.attributes.AttributeExtractor;
import org.zalando.logbook.attributes.HttpAttributes;

public class OriginExtractor implements AttributeExtractor {
	
	@Override
	public HttpAttributes extract(final HttpRequest request) {
		return HttpAttributes.of("origin", request.getOrigin());
	}

}
