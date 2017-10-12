package com.quackslike;

public class App {
	private String appName;

	public static void main(String...args) {
		System.out.println("Hello");
	}


	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppName() {
		return appName;
	}
}