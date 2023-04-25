package com.multi.myStagebox;

public class HashtagVO {
	private int no;
	private String title;
	private String genre;
	private String place;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "ConcertVO [no=" + no + ", title=" + title + ", genre=" + genre + ", place=" + place + "]";
	}
	
	
	
}
