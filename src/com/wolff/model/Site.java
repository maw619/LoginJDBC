package com.wolff.model;

public class Site {

	private int site_id;
	private String url;
	private String channel;
	private String genre;
	
	public Site() {
		
	}

	public Site(String url, String channel, String genre) {
		this.url = url;
		this.channel = channel;
		this.genre = genre;
	}

	public Site(int site_id, String url, String channel, String genre) {
		this.site_id = site_id;
		this.url = url;
		this.channel = channel;
		this.genre = genre;
	}

	public int getSite_id() {
		return site_id;
	}

	public void setSite_id(int site_id) {
		this.site_id = site_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Site [site_id=" + site_id + ", url=" + url + ", channel=" + channel + ", genre=" + genre + "]";
	}
	
}
