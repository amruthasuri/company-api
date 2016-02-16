# Company REST API

Its a POC with Spark Java ( micro framework ) with Mongodb, Spring Data as the object-mapping framework and Spring Boot as Spring application configuration framework ( with less/no configuration ).

this app includes the following features

 * add a company
 * update a company
 * delete a company
 * company list


And here's some curl code!:

```curl
Companies List
	curl 'http://localhost:4567/companies'
```



### frameworks used to make this:

 * [Spark-Java](http://sparkjava.com/) - micro services framework
 * [Spring-data-mongodb](http://projects.spring.io/spring-data-mongodb/) - the object-mapping for mongodb
 * [Spring-boot](http://projects.spring.io/spring-boot/ ) - faster development of spring applications with less/no configuration
 * [Jackson mapper](http://wiki.fasterxml.com/JacksonHome) - JSON databinding ( serialization/deserialization)
