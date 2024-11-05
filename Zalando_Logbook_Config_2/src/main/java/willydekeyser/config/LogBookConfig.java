package willydekeyser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.Logbook;
import org.zalando.logbook.core.DefaultHttpLogFormatter;
import org.zalando.logbook.core.DefaultHttpLogWriter;
import org.zalando.logbook.core.DefaultSink;

@Configuration
public class LogBookConfig {
	    
	@Bean
	Logbook logbook() {
		return Logbook.builder()
				.sink(new DefaultSink(new DefaultHttpLogFormatter(), new DefaultHttpLogWriter()))
				.build();
	}

}