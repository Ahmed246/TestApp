package com.java.testapp.systemdesign.repositories;

import com.java.testapp.systemdesign.entities.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PermissionRepository extends JpaRepository<Permission, Long>
{
}
