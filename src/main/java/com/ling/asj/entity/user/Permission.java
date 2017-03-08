package com.ling.asj.entity.user;

public class Permission {
	
	private Long id;
	
	private Long parentId;
	
	private String name;
	
	private String info;
	
	private boolean isMenu;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public boolean isMenu() {
		return isMenu;
	}

	public void setMenu(boolean isMenu) {
		this.isMenu = isMenu;
	}
	
	

}
