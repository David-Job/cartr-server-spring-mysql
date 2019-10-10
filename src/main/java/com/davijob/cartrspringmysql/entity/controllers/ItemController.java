package com.davijob.cartrspringmysql.entity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davijob.cartrspringmysql.entity.models.Item;
import com.davijob.cartrspringmysql.entity.services.IitemService;

@RestController
public class ItemController {

	@Autowired
	IitemService itemService;

	@GetMapping("/api/item/{id}")
	public Item getItem(@PathVariable(name = "id") long id) {
		return itemService.getItem(id);
	}

	@GetMapping("/api/items")
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	}

	@PostMapping("/api/items")
	public void addItem(Item item) {
		itemService.addItem(item);
	}

	@PutMapping("/api/item/{id}")
	public void updateItem(@PathVariable(name = "id") long id, Item item) {
		itemService.updateItem(id, item);
	}

	@DeleteMapping("/api/item/{id}")
	public void deleteItem(@PathVariable(name = "id") long id) {
		itemService.deleteItem(id);
	}

	@DeleteMapping("/api/items")
	public void deleteAllItems() {
		itemService.deleteAllItems();
	}
}
