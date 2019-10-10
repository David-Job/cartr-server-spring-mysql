package com.davijob.cartrspringmysql.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.davijob.cartrspringmysql.entity.models.Item;

public interface IitemDao extends CrudRepository<Item, Long> {

}
