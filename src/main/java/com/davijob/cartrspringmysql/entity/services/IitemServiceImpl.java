package com.davijob.cartrspringmysql.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davijob.cartrspringmysql.entity.dao.IitemDao;
import com.davijob.cartrspringmysql.entity.models.Item;

@Service
public class IitemServiceImpl implements IitemService {
	
	@Autowired
	IitemDao itemDao;

	@Override
	public Item getItem(long id) {
		return itemDao.findById(id).get();
	}

	@Override
	public List<Item> getAllItems() {
		return (List<Item>) itemDao.findAll();
	}

	@Override
	public void addItem(Item item) {
		itemDao.save(item);
	}

	@Override
	public void updateItem(long id, Item item) {
		item.setId(id);
		itemDao.save(item);
	}

	@Override
	public void deleteItem(long id) {
		itemDao.deleteById(id);
	}

	@Override
	public void deleteAllItems() {
		itemDao.deleteAll();
	}

}
