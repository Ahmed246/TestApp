package com.java.testapp.systemdesign.entities;

import com.java.testapp.systemdesign.enums.ItemType;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Item
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private ItemType itemType;
	private String name;
	@ManyToOne
	private PermissionGroup permissionGroup;
}
