package com.java.testapp.systemdesign.repositories;

import com.java.testapp.systemdesign.entities.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface FileRepository extends JpaRepository<File, Long>
{
}
