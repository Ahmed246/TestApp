package com.java.testapp.systemdesign.repositories;

import com.java.testapp.systemdesign.entities.PermissionGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PermissionGroupRepository extends JpaRepository<PermissionGroup, Long>
{
}
