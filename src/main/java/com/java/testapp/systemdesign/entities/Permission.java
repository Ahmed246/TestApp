package com.java.testapp.systemdesign.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Permission
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userEmail;
	private String permissionLevel;
	@ManyToOne
	private PermissionGroup permissionGroup;
}
