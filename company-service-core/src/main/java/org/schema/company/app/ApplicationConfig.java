package org.schema.company.app;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;

//@Configuration
@PropertySource("mongo.properties")
@EnableConfigurationProperties(MongoProperties.class)
public class ApplicationConfig {

	    @Autowired
	    private MongoProperties mongoProperties; // created from MongoAutoConfiguration

	    @Autowired
	    private MongoClient mongoClient; // created from MongoAutoConfiguration

	    @Autowired
	    private Environment environement; 
	    
	    @Bean
	    public MongoClient mongoClient() throws UnknownHostException {
	    	return mongoProperties.createMongoClient(MongoClientOptions.builder().build(),environement);
	    }
/*	    @Bean
	    public Datastore datastore() throws ClassNotFoundException {
	        Morphia morphia = new Morphia();

	        // map entities, there is maybe a better way to find and map all entities
	        ClassPathScanningCandidateComponentProvider entityScanner = new ClassPathScanningCandidateComponentProvider(true);
	        entityScanner.addIncludeFilter(new AnnotationTypeFilter(Entity.class));
	        for (BeanDefinition candidate : entityScanner.findCandidateComponents("your.basepackage")) { // from properties?
	            morphia.map(Class.forName(candidate.getBeanClassName()));
	        }

	        return morphia.createDatastore(mongoClient, "dataStoreInstanceId"); // "dataStoreInstanceId" may come from properties?
	    }
*/}
