package com.java.spring.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collection
{
	private List<Object> list;
	private Set<Object> set;
	private Map<Object,Object> map;
	private Properties prop;
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	public Set<Object> getSet() {
		return set;
	}
	public void setSet(Set<Object> set) {
		this.set = set;
	}
	public Map<Object, Object> getMap() {
		return map;
	}
	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	

}
