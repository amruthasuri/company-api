package org.schema.company;

import java.util.List;

import org.schema.company.model.Company;
import org.schema.company.repository.CompanyRepository;
import org.schema.company.service.ICompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

/*@Configuration
@ComponentScan(basePackages={"org.schema.company"})
*/@EnableConfigurationProperties(MongoProperties.class)
@PropertySource("mongo.properties")
@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired
	private CompanyRepository repository;
		
	public void run(String... args) {
		logger.debug("mongodb connection start.");
	}
	
	public static void main(String[] args) {
		logger.debug("mongodb connection start.");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		ICompanyService companyService = (ICompanyService) context.getBean(ICompanyService.class);
		
		List<Company> companies = companyService.getCompanies();
		
		System.out.println("companies list: " + companies.size());
		/*ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);*/
		logger.debug("mongodb connection successful.");
	}
	
}
