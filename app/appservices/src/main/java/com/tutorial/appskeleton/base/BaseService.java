package com.tutorial.appskeleton.base;

public interface BaseService {
	public void create();
	public <T> void read(int id);
	public <T> void update(int id, T obj);
	public void delete(int id);
}
