package br.unicamp.ic.lsd.jael.soa.car.db.entities;

public class Enterprise {

	private Long enterpriseId;
	private String enterpriseName;
	
	public Long getEnterpriseId() {
		return enterpriseId;
	}
	
	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	
	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
}
