package willydekeyser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.Logbook;
import org.zalando.logbook.core.DefaultHttpLogWriter;
import org.zalando.logbook.core.DefaultSink;
import org.zalando.logbook.core.WithoutBodyStrategy;
import org.zalando.logbook.json.JsonHttpLogFormatter;

@Configuration
public class LogBookConfig {
	    
	@Bean
	Logbook logbook() {
		return Logbook.builder()
				.correlationId(new CustomCorrelationId())
				.attributeExtractor(new OriginExtractor())
				.condition(new CustomCondition())
			    .queryFilter(new CustomQueryFilter())
			    .pathFilter(new CustomPathFilter())
			    .headerFilter(new CustomHeaderFilter())
			    .bodyFilter(new CustomBodyFilter())
			    .requestFilter(new CustomRequestFilter())
			    .responseFilter(new CustomResponseFilter())
			    .strategy(new WithoutBodyStrategy())
				.sink(new DefaultSink(
						new JsonHttpLogFormatter(), 
						new DefaultHttpLogWriter()
				))
				.build();
	}

}