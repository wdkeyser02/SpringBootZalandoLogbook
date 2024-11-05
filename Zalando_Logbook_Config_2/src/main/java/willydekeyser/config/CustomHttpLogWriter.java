package willydekeyser.config;

import java.io.IOException;

import org.zalando.logbook.Correlation;
import org.zalando.logbook.HttpLogWriter;
import org.zalando.logbook.Precorrelation;

public class CustomHttpLogWriter implements HttpLogWriter {

	@Override
	public void write(Precorrelation precorrelation, String request) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void write(Correlation correlation, String response) throws IOException {
		// TODO Auto-generated method stub

	}

}
