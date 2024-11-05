package willydekeyser.config;

import java.io.IOException;

import org.zalando.logbook.Correlation;
import org.zalando.logbook.HttpLogFormatter;
import org.zalando.logbook.HttpRequest;
import org.zalando.logbook.HttpResponse;
import org.zalando.logbook.Precorrelation;

public class CustomHttpLogFormatter implements HttpLogFormatter {

	@Override
	public String format(Precorrelation precorrelation, HttpRequest request) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String format(Correlation correlation, HttpResponse response) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
