package com.SpringCore.StandaloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class App {

	private List<String> name;
	private Map<String, String> free;
	private Properties properties;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public Map<String, String> getFree() {
		return free;
	}

	public void setFree(Map<String, String> free) {
		this.free = free;
	}

	public Properties getProp() {
		return properties;
	}

	public void setProp(Properties prop) {
		this.properties = prop;
	}

	@Override
	public String toString() {
		return "App [name=" + name + ", free=" + free + ", prop=" + properties + "]";
	}

	public App(List<String> name, Map<String, String> free, Properties prop) {
		super();
		this.name = name;
		this.free = free;
		this.properties = prop;
	}

	public App() {
		super();
		// TODO Auto-generated constructor stub
	}

}
