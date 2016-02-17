# Company REST API

Its a POC with Spark Java ( micro framework ) and Mongodb as datastore with Spring boot and Spring data mongodb.

this app includes the following features

 * add a company
 * update a company
 * delete a company
 * company list

And here are some curl request samples

```curl
Companies List
	curl 'http://localhost:4567/companies'
```

### frameworks used to make this:

 * [Spark-Java](http://sparkjava.com/) - A micro framework for creating web applications in Java 8.
 * [Spring-data-mongodb](http://projects.spring.io/spring-data-mongodb/) - the object-mapping for mongodb
 * [Spring-boot](http://projects.spring.io/spring-boot/ ) - faster development of spring applications with less/no configuration
 * [Jackson mapper](http://wiki.fasterxml.com/JacksonHome) - JSON databinding ( serialization/deserialization)
