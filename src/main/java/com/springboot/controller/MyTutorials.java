package com.springboot.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "mytutorial")
@Component
public class MyTutorials {
	private int channelId;
	private String channelName;
	private String url;

	public MyTutorials() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyTutorials(int channelId, String channelName, String url) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.url = url;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "MyTutorials [channelId=" + channelId + ", channelName=" + channelName + ", url=" + url + "]";
	}

}

