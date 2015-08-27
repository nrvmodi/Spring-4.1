package com.nirav.modi.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class BeanPresenceCondition implements Condition {

	@Override
	public boolean matches(ConditionContext conditionContext,
			AnnotatedTypeMetadata metadata) {
		MyConditionalBean bean = conditionContext.getBeanFactory().getBean(
				MyConditionalBean.class);
		return bean != null;
	}

}
