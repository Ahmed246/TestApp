package com.java.testapp.systemdesign.repositories;

import com.java.testapp.systemdesign.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ItemRepository extends JpaRepository<Item, Long>
{
}
