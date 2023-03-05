package com.java.testapp.systemdesign.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class File
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Item item;
	@Lob
	private byte[] file;

}
