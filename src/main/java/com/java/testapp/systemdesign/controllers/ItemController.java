package com.java.testapp.systemdesign.controllers;

import com.java.testapp.systemdesign.entities.Item;
import com.java.testapp.systemdesign.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController
{
	@Autowired
	private ItemService itemService;

	@GetMapping("/items")
	public List<Item> findAllItems()
	{
		return itemService.fetchItems();
	}

	@PostMapping("/items")
	public void createItem(@RequestBody Item item)
	{
		itemService.saveItem(item);
	}
}
