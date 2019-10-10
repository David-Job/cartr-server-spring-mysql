package com.davijob.cartrspringmysql.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity(name = "items")
public class Item implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "item_id")
	@NotEmpty
	private String itemId;
	
	@NotEmpty
	private String brand;
	
	@NotNull
	private float price;
	
	@NotNull
	private long stock;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public long getStock() {
		return stock;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}

	public Item(long id, @NotEmpty String itemId, @NotEmpty String brand, @NotNull float price, @NotNull long stock) {
		this.id = id;
		this.itemId = itemId;
		this.brand = brand;
		this.price = price;
		this.stock = stock;
	}

	public Item() {
	}

}
