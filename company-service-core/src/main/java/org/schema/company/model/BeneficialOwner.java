package org.schema.company.model;

import org.springframework.data.annotation.Id;

public class BeneficialOwner {
	
	@Id
	private String id;
	
	private String name;
	
	
	private BeneficialOwnerType ownerType;
	
	public BeneficialOwner() {		
	}
	
	public BeneficialOwner(String name, BeneficialOwnerType ownerType) {
		this.name = name;
		this.ownerType = ownerType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BeneficialOwnerType getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(BeneficialOwnerType ownerType) {
		this.ownerType = ownerType;
	}
	
}
