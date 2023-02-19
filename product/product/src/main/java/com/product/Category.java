package com.product;
import java.util.ArrayList;

public class Category {
		
	/*
	 * Atributos
	 * */
	public int category_id;
	private String category;
	private String acronym;

	public Category(Integer category_id, String category, String acronym){
		this.category_id = category_id;
		this.category = category;
		this.acronym = acronym;
	}

	/*
	 * Getters
	 * */
	public int getCategory_id() {
		return category_id;
	}

	public String getCategory() {
		return category;
	}

	public String getAcronym() {
		return acronym;
	}
	
	
	
}
