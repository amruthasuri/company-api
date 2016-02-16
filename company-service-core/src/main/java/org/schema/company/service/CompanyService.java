package org.schema.company.service;

import java.util.List;

import org.schema.company.model.Company;
import org.schema.company.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService implements ICompanyService {

	@Autowired
	CompanyRepository repository;
	
	@Override
	public void createCompany(Company company) {
		repository.save(company);
	}
	
	@Override
	public void updateCompany(Company company) {
		repository.save(company);
	}

	@Override
	public void deleteCompany(Company company) {
		repository.delete(company);
	}
	
	@Override
	public List<Company> getCompanies() {
		return repository.findAll();		
	}

	public void setRepository(CompanyRepository repository) {
		this.repository = repository;
	}
}
