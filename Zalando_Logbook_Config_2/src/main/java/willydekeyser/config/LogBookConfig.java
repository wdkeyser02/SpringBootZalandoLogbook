package willydekeyser.config;

import static org.zalando.logbook.core.QueryFilters.replaceQuery;

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
				//.correlationId(new CustomCorrelationId())
				//.attributeExtractor(new OriginExtractor())
				//.condition(new CustomCondition())
			    //.queryFilter(new CustomQueryFilter())
				.queryFilter(replaceQuery("password", "TESTEN"))
			    //.pathFilter(new CustomPathFilter())
			    //.headerFilter(new CustomHeaderFilter())
			    //.bodyFilter(new CustomBodyFilter())
				//.bodyFilter(jsonPath("$.password").replace("<XXXXXXX>"))
			    //.requestFilter(new CustomRequestFilter())
			    //.responseFilter(new CustomResponseFilter())
			    //.strategy(new CustomStrategy())
				.sink(new DefaultSink(
						new DefaultHttpLogFormatter(), 
						new DefaultHttpLogWriter()
				))
				.build();
	}

}