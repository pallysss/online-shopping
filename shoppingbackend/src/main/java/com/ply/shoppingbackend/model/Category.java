package com.ply.shoppingbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ply.shoppingbackend.base.BaseEntity;

@Entity
@Table(name = Category.TABLE_NAME)
public class Category extends BaseEntity {
	public static final String TABLE_NAME = "TBM_CATEGORY";
	
	@Id
	@Column(name = "id", length = 7 , nullable = false)
	private String id;
	
	@Column(name = "name", length = 20, nullable = false)
	private String name;
	
	@Column(name = "description", length = 100)
	private String description;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@Column(name = "is_active")
	private Boolean active;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description="
				+ description + ", imageUrl=" + imageUrl + ", active=" + active
				+ "]";
	}
	
	
	

}
