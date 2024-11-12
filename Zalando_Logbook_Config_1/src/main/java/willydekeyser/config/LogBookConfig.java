package willydekeyser.config;

//import java.util.Arrays;

//import org.slf4j.event.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.Logbook;
//import org.zalando.logbook.core.CurlHttpLogFormatter;
//import org.zalando.logbook.core.ChunkingSink;
//import org.zalando.logbook.core.CommonsLogFormatSink;
//import org.zalando.logbook.core.CompositeSink;
//import org.zalando.logbook.core.DefaultHttpLogFormatter;
//import org.zalando.logbook.core.DefaultHttpLogWriter;
//import org.zalando.logbook.core.DefaultSink;
//import org.zalando.logbook.core.SplunkHttpLogFormatter;
//import org.zalando.logbook.core.StreamHttpLogWriter;
//import org.zalando.logbook.json.FastJsonHttpLogFormatter;
//import org.zalando.logbook.core.ExtendedLogFormatSink;
//import org.zalando.logbook.json.JsonHttpLogFormatter;
//import org.zalando.logbook.logstash.LogstashLogbackSink;

@Configuration
public class LogBookConfig {
	    
	@Bean
	Logbook logbook() {
		return Logbook.builder()
				//.sink(new DefaultSink(new DefaultHttpLogFormatter(), new DefaultHttpLogWriter()))
				//.sink(new DefaultSink(new DefaultHttpLogFormatter(), new StreamHttpLogWriter()))
				//.sink(new DefaultSink(new CurlHttpLogFormatter(), new DefaultHttpLogWriter()))
				//.sink(new DefaultSink(new FastJsonHttpLogFormatter(), new DefaultHttpLogWriter()))
				//.sink(new DefaultSink(new JsonHttpLogFormatter(), new DefaultHttpLogWriter()))
				//.sink(new DefaultSink(new SplunkHttpLogFormatter(), new DefaultHttpLogWriter()))
				//.sink(new ChunkingSink(new DefaultSink(new DefaultHttpLogFormatter(), new DefaultHttpLogWriter()), 10))
				//.sink(new LogstashLogbackSink(new JsonHttpLogFormatter()))
				//.sink(new CompositeSink(Arrays.asList(new LogstashLogbackSink(new JsonHttpLogFormatter(), Level.TRACE), new CommonsLogFormatSink(new DefaultHttpLogWriter()))))
				//.sink(new CommonsLogFormatSink(new DefaultHttpLogWriter()))
				//.sink(new ExtendedLogFormatSink(new DefaultHttpLogWriter()))
				.build();
	}
	
	


}
