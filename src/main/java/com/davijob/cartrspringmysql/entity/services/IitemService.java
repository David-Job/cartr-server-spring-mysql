package com.davijob.cartrspringmysql.entity.services;

import java.util.List;

import com.davijob.cartrspringmysql.entity.models.Item;

public interface IitemService {
	public Item getItem(long id);
	public List<Item> getAllItems();
	public void addItem(Item item);
	public void updateItem(long id, Item item);
	public void deleteItem(long id);
	public void deleteAllItems();
}
