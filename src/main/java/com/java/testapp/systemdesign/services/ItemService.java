package com.java.testapp.systemdesign.services;

import com.java.testapp.systemdesign.entities.Item;
import com.java.testapp.systemdesign.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService
{
	@Autowired
	private ItemRepository itemRepository;

	public ItemService(ItemRepository itemRepository)
	{
		this.itemRepository = itemRepository;
	}

	public void saveItem(Item item)
	{

		itemRepository.save(item);
	}

	public List<Item> fetchItems()
	{
		return itemRepository.findAll();
	}
}
