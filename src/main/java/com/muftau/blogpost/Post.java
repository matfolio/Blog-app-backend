package com.muftau.blogpost;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Post {
	
	@Id
	private String id;
	private String title;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	private String content;
	private Date createdAt;
	
	public Post() {
		
	}
	
	
	public Post(String id, String title, String content, Date createdAt) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.createdAt = createdAt;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
