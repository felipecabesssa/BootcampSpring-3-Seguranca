package com.devsuperior.dscatalog.dto;

import java.io.Serializable;

import com.devsuperior.dscatalog.entities.Role;

public class RoleDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String authorithy;
	
	public RoleDTO() {
	}

	public RoleDTO(Long id, String authorithy) {
		super();
		this.id = id;
		this.authorithy = authorithy;
	}
	
	public RoleDTO(Role role) {
		super();
		id = role.getId();
		authorithy = role.getAuthority();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthorithy() {
		return authorithy;
	}

	public void setAuthorithy(String authorithy) {
		this.authorithy = authorithy;
	}

	
}
