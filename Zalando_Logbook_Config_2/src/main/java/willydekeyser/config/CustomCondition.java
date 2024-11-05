package willydekeyser.config;

import java.util.function.Predicate;

import org.zalando.logbook.HttpRequest;

public class CustomCondition implements Predicate<HttpRequest> {

	@Override
	public boolean test(HttpRequest t) {
		return true;
	}

}
