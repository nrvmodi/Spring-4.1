package com.nirav.modi.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nirav.modi.datasource.Datasource;

@Repository
public class PersonRepository {

	@Autowired
	private Datasource datasource;

	public String getDetail() {
		return datasource.getDatasource();
	}

}
