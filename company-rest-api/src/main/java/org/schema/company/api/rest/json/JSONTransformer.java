package org.schema.company.api.rest.json;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

import spark.ResponseTransformer;

public class JSONTransformer implements ResponseTransformer{

	@Override
	public String render(Object object) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);		
		return mapper.writeValueAsString(object);
	}

}
