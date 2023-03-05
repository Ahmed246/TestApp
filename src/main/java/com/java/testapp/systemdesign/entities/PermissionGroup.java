package com.java.testapp.systemdesign.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PermissionGroup
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String groupName;
}
