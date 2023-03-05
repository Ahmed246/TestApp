package com.java.testapp.systemdesign.services;

import com.java.testapp.systemdesign.repositories.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionService
{
	@Autowired
	private PermissionRepository permissionRepository;

	public PermissionService(PermissionRepository permissionRepository)
	{
		this.permissionRepository = permissionRepository;
	}
}
