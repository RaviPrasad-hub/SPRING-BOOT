package com.coconut.springweb.InfoContributor;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.boot.actuate.info.Info.Builder;

public class CustomInfoContributor implements  InfoContributor {

	@Override
	public void contribute(Builder builder) {
		builder.withDetail("customKey", "customValue");
		
	}
}
