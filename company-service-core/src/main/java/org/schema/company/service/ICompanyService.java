package org.schema.company.service;

import java.util.List;

import org.schema.company.model.Company;

public interface ICompanyService {

	void createCompany(Company company);

	void updateCompany(Company company);

	void deleteCompany(Company company);

	List<Company> getCompanies();

}