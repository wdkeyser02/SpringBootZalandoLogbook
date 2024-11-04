package willydekeyser.config;

import static org.zalando.logbook.core.QueryFilters.defaultValue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.Logbook;
// import org.zalando.logbook.core.CurlHttpLogFormatter;
import org.zalando.logbook.core.DefaultHttpLogFormatter;
import org.zalando.logbook.core.DefaultSink;
import org.zalando.logbook.core.StreamHttpLogWriter;
// import org.zalando.logbook.json.JsonHttpLogFormatter;

@Configuration
public class LogBookConfig {
	
	DefaultSink httpSink = new DefaultSink(new DefaultHttpLogFormatter(), new StreamHttpLogWriter()); 
    // DefaultSink curlSink = new DefaultSink(new CurlHttpLogFormatter(), new DefaultHttpLogWriter());
    // DefaultSink jsonSink = new DefaultSink(new JsonHttpLogFormatter(), new DefaultHttpLogWriter());
    
	@Bean
	Logbook logbook() {
		return Logbook.builder()
				.queryFilter(defaultValue())
				.sink(httpSink)
				.build();
	}

}
