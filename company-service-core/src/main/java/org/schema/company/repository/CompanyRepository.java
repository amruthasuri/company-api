package org.schema.company.repository;

import java.io.Serializable;
import java.util.List;

import org.schema.company.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends MongoRepository<Company, Serializable> {

	public List<Company> findAll();

}
