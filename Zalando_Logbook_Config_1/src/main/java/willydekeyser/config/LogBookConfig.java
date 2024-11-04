package willydekeyser.config;

import static org.zalando.logbook.core.QueryFilters.defaultValue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.Logbook;

@Configuration
public class LogBookConfig {
	
	@Bean
	Logbook logbook() {
		return Logbook.builder()
				.queryFilter(defaultValue())
				.build();
	}

}
