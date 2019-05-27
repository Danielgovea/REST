package com.in28minutes.rest.webservices.restfullwebservices.post;

import java.util.Date;

public class Post {
	private Integer userId;
	private Integer id;
	private String message;
	private Date postDate;
	
	protected Post() {
		
	}
	
	public Post(Integer userId, Integer id, String message, Date postDate) {
		super();
		this.userId = userId;
		this.id = id;
		this.message = message;
		this.postDate = postDate;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	@Override
	public String toString() {
		return "Post [userId=" + userId + ", id=" + id + ", message=" + message + ", postDate=" + postDate + "]";
	}

	
	
	
}

