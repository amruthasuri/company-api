package org.schema.company.api.rest;

import static spark.Spark.get;
import static spark.Spark.post;

import java.util.List;

import org.schema.company.Application;
import org.schema.company.api.rest.json.JSONDeSerializer;
import org.schema.company.api.rest.json.JSONTransformer;
import org.schema.company.model.Company;
import org.schema.company.service.ICompanyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spark.servlet.SparkApplication;

public class CompanyAPI implements SparkApplication{

	public void init() {		
	}
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		ICompanyService service = context.getBean(ICompanyService.class);
		
		List<Company> companies = service.getCompanies();
				
        JSONTransformer jsonTransformer = new JSONTransformer();
        
		get("/companies", (req, res) -> {
			res.type("application/json");			
			return service.getCompanies();
		},jsonTransformer);
		
		post("/company", "application/json",(req,res) -> {
			String json = req.body();
			System.out.println(json);
			Company company = JSONDeSerializer.asObject(json,Company.class);
			service.createCompany(company);
			return company;
		},jsonTransformer);
	}
}