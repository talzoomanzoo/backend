package com.talzoo.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Component
@Entity(name = "AnswerDto")
public class AnswerDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answerNo")
    private int answerNo;
    
    @Column(name = "articleNo")
    private int articleNo;

    @Column(name = "content", length = 2000)
    private String content;

    @Column(name = "writeDate")
    private LocalDateTime writeDate;
    
    @Column(name = "modifyDate")
    private LocalDateTime modifyDate;

    @ManyToOne
    @JoinColumn(name = "writeId")
    private SiteUser writeId; 
    
    @ManyToOne
    private OnboardDto onboardDto;

	public OnboardDto getOnboardDto() {
		return onboardDto;
	}

	public void setOnboardDto(OnboardDto onboardDto) {
		this.onboardDto = onboardDto;
	}

    @PrePersist
    public void prePersist() {
        writeDate = LocalDateTime.now(); // Set writeDate to the current timestamp when persisting
        modifyDate = LocalDateTime.now(); // Set modifyDate to the current timestamp when persisting
    }

    @PreUpdate
    public void preUpdate() {
        modifyDate = LocalDateTime.now(); // Set modifyDate to the current timestamp when updating
    }

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(LocalDateTime writeDate) {
		this.writeDate = writeDate;
	}

	public SiteUser getWriteId() {
		return writeId;
	}

	public void setWriteId(SiteUser writeId) {
		this.writeId = writeId;
	}

	public int getAnswerNo() {
		return answerNo;
	}

	public void setAnswerNo(int answerNo) {
		this.answerNo = answerNo;
	}

	public int getArticleNo() {
		return articleNo;
	}
	
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}

    // Constructors, getters, and setters

    // Add constructors, getters, and setters as per your requirements.
}
