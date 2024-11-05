package willydekeyser.config;

import org.zalando.logbook.QueryFilter;

public class CustomQueryFilter implements QueryFilter {

	@Override
	public String filter(String query) {
		System.out.println("+++" + query);
		return "Test Filter";
	}

}
