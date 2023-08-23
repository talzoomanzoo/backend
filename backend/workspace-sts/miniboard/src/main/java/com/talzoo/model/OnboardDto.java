package com.talzoo.model;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Component // 추가
public class OnboardDto { 
	private int article_no;
	@NotEmpty(message="Input Title")
    @Size(max=200)
	private String title;
	@NotEmpty(message="Input Content")
	private String content;
	private String write_date;
	private String write_id;
	private int view_count;
	private int like_count;
	private int dislike_count;
	
	public int getLike_count() {
		return like_count;
	}
	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}
	public int getView_count() {
		return view_count;
	}
	public void setView_count(int view_count) {
		this.view_count = view_count;
	}
	public int getArticle_no() {
		return article_no;
	}
	public void setArticle_no(int article_no) {
		this.article_no = article_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWrite_date() {
		return write_date;
	}
	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}
	public String getWrite_id() {
		return write_id;
	}
	public void setWrite_id(String write_id) {
		this.write_id = write_id;
	}
	public int getDislike_count() {
		return dislike_count;
	}
	public void setDislike_count(int dislike_count) {
		this.dislike_count = dislike_count;
	}
}