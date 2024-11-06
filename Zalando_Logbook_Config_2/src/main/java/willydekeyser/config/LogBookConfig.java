package willydekeyser.config;

import static org.zalando.logbook.core.QueryFilters.replaceQuery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.Logbook;
import org.zalando.logbook.core.DefaultHttpLogFormatter;
import org.zalando.logbook.core.DefaultHttpLogWriter;
import org.zalando.logbook.core.DefaultSink;
import org.zalando.logbook.core.RequestFilters;
import org.zalando.logbook.core.ResponseFilters;

import static org.zalando.logbook.core.Conditions.contentType;
import static org.zalando.logbook.core.Conditions.exclude;

@Configuration
public class LogBookConfig {
	    
	@Bean
	Logbook logbook() {
		return Logbook.builder()
				.requestFilter(RequestFilters.replaceBody(message -> contentType("text/*", "text/html").test(message) ? "Request false" : "Request TRUE"))
				.responseFilter(ResponseFilters.replaceBody(message -> contentType("text/*", "text/html").test(message) ? "Request false" : "Response TRUE"))
				.condition(exclude())
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