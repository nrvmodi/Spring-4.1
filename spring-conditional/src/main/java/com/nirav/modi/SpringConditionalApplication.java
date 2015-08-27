package com.nirav.modi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

import com.nirav.modi.conditional.BeanPresenceCondition;
import com.nirav.modi.conditional.DevDatasourceCondition;
import com.nirav.modi.conditional.MyConditionalBean;
import com.nirav.modi.conditional.ProdDatasourceCondition;
import com.nirav.modi.datasource.Datasource;
import com.nirav.modi.datasource.DevDatasource;
import com.nirav.modi.datasource.ProdDatasource;

@SpringBootApplication
public class SpringConditionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConditionalApplication.class, args);
	}

	@Bean
	@Conditional(value = DevDatasourceCondition.class)
	public Datasource getDevDatasource() {
		return new DevDatasource();
	}

	@Bean
	@Conditional(value = ProdDatasourceCondition.class)
	public Datasource getProdDatasource() {
		return new ProdDatasource();
	}

	@Bean
	@Conditional(value=BeanPresenceCondition.class)
	public MyConditionalBean getMyConditionalBean() {
		MyConditionalBean conditionalBean = new MyConditionalBean();
		conditionalBean.getConditionalBean();
		return conditionalBean;
	}
}
