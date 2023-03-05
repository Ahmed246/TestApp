package com.java.testapp.systemdesign.services;

import com.java.testapp.systemdesign.repositories.PermissionGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionGroupService
{
	@Autowired
	private PermissionGroupRepository permissionGroupRepository;

	public PermissionGroupService(PermissionGroupRepository permissionGroupRepository)
	{
		this.permissionGroupRepository = permissionGroupRepository;
	}
}
