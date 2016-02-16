package org.schema.company.model;

import org.springframework.data.annotation.Id;

public class BeneficialOwner {
	
	@Id
	private String id;
	
	private String name;
	
	private BeneficialOwnerType ownerType;
	
	public BeneficialOwner(String name, BeneficialOwnerType ownerType) {
		this.name = name;
		this.ownerType = ownerType;
	}

	public String getName() {
		return name;
	}

	public BeneficialOwnerType getOwnerType() {
		return ownerType;
	}	
	
}
