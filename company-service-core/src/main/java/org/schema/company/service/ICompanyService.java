package org.schema.company.service;

import java.io.Serializable;
import java.util.List;

import org.schema.company.model.Company;

public interface ICompanyService {

	void create(Company company);

	void update(Company company);

	void delete(Serializable companyId);

	List<Company> getCompanies();

}