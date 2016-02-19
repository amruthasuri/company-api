package org.schema.company.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="companies")
public class Company {

	@Id
	private String companyId;
	
	private String name;
	
	private CompanyAddress address;
	
	private String email;
	private String phone;
	
	private List<BeneficialOwner> beneficialOwners; 
	

	public void addBeneficialOwner(BeneficialOwner owner) {
		if ( beneficialOwners == null ) {
			beneficialOwners = new ArrayList<>();
		}
		beneficialOwners.add(owner);		
	}
	
	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CompanyAddress getAddress() {
		return address;
	}

	public void setAddress(CompanyAddress address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public List<BeneficialOwner> getBeneficialOwners() {
		return beneficialOwners;
	}

	public void setBeneficialOwners(List<BeneficialOwner> beneficialOwners) {
		this.beneficialOwners = beneficialOwners;
	}	
}