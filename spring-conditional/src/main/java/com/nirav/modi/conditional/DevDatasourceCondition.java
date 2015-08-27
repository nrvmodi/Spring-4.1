package com.nirav.modi.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DevDatasourceCondition implements Condition {

	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
		String property = conditionContext.getEnvironment().getProperty("database.name");
		return property.equalsIgnoreCase("dev");
	}

}
