package org.mule.examples.filters;

import java.util.Map;

import org.mule.api.MuleMessage;
import org.mule.api.routing.filter.Filter;

public class FreeMembershipDiscountFilter implements Filter {

	
	@Override
	public boolean accept(MuleMessage message) {
		Map<String, Object> payloadMap = (Map<String, Object>) message.getPayload();
		boolean isPremium = (boolean) payloadMap.get("premium");
		int months = Integer.parseInt(payloadMap.get("months").toString());
		int purchase = Integer.parseInt(payloadMap.get("purchases").toString());
		if (isPremium)
			return (months >= 6 && purchase >= 1000);
		else
			return (months <= 6 && purchase >= 2500
			|| (months > 6 && months < 12 && purchase >= 2000)
			|| (months >= 12 && purchase >= 1500));
	}

}
