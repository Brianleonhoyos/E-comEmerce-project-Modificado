package com.jtspringproject.JtSpringProject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="CATEGORY")
public class Category {
	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;

	private Category() {}

	// Builder para Category
	public static class Builder {
		private final Category category;

		public Builder() {
			category = new Category();
		}

		public Builder setId(int id) {
			category.id = id;
			return this;
		}

		public Builder setName(String name) {
			category.name = name;
			return this;
		}

		public Category build() {
			return category;
		}
	}

	// Factory Method para Category
	public static class CategoryFactory {
		public static Category createCategory(String name) {
			return new Category.Builder()
					.setName(name)
					.build();
		}

		public static Category updateCategory(int id, String name) {
			return new Category.Builder()
					.setId(id)
					.setName(name)
					.build();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
