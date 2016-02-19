package org.schema.company.api.rest;

import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.put;

import org.schema.company.Application;
import org.schema.company.api.rest.json.JSONDeSerializer;
import org.schema.company.api.rest.json.JSONTransformer;
import org.schema.company.model.Company;
import org.schema.company.service.ICompanyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spark.servlet.SparkApplication;

public class CompanyAPI implements SparkApplication{

	private static final String APPLICATION_JSON = "application/json";

	public void init() {		
	}
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		ICompanyService companyService = context.getBean(ICompanyService.class);
						
        JSONTransformer jsonTransformer = new JSONTransformer();
        
		get("/companies", (req, res) -> {
			res.type(APPLICATION_JSON);			
			return companyService.getCompanies();
		},jsonTransformer);
		
		post("/company", APPLICATION_JSON,(req,res) -> {
			String json = req.body();
			System.out.println(json);
			Company company = JSONDeSerializer.asObject(json,Company.class);
			companyService.create(company);
			return company;
		},jsonTransformer);
		
		put("/company/:companyId", APPLICATION_JSON,(req,res) -> {
			String id = req.params("companyID");
			String json = req.body();
			Company company = JSONDeSerializer.asObject(json,Company.class);
			company.setCompanyId(id);
			companyService.update(company);
			return company;
		},jsonTransformer);

		delete("/company/:companyId", (req,res) -> {
			companyService.delete(req.params("companyId"));
			return "";
		});
		
	}
	
}