package org.schema.company.api.rest.json;

import java.io.IOException;

import org.schema.company.model.Company;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONDeSerializer {

	public static <T> T asObject(String json, Class<T> objClass) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(json, objClass);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		Company company = (Company) JSONDeSerializer.<Company> asObject("  {\"name\": \"UpWork\"}",Company.class);
		System.out.println(company);
	}
}
