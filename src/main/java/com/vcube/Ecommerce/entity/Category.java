package com.vcube.Ecommerce.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer categoryid;
	String categoryName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "category")
	List<Product>products;
	

}
