package com.talzoo.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.validation.constraints.NotEmpty;

@Component
@Entity(name="OnboardDto")
public class OnboardDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "articleNo")
    private int articleNo;

    @Column(name = "title", length = 100)
    @NotEmpty(message = "제목은 필수항목입니다.")
    private String title;

    @Column(name = "content", length = 2000)
    @NotEmpty(message = "내용은 필수항목입니다.")
    private String content;

    @Column(name = "writeDate")
    private LocalDateTime writeDate;
    
    @Column(name = "modifyDate")
    private LocalDateTime modifyDate;

    @ManyToOne
    @JoinColumn(name = "writeId")
    private SiteUser writeId;

    @Column(name = "viewCount")
    private int viewCount;

    @Column(name = "likeCount")
    private int likeCount;

    @Column(name = "dislikeCount")
    private int dislikeCount;
    
    @OneToMany(mappedBy = "onboardDto", cascade = CascadeType.REMOVE)
    private List<AnswerDto> answerList= new ArrayList<>();

    public List<AnswerDto> getAnswerList() {
		return answerList;
	}
	public void setAnswerList(List<AnswerDto> answerList) {
		this.answerList = answerList;
	}
	
    // Add an AnswerDto to the answerList
    public void addAnswer(AnswerDto answer) {
        this.answerList.add(answer);
    }

    // Retrieve AnswerDto objects with the same articleNo
    public List<AnswerDto> getAnswersByArticleNo(int articleNo) {
        return this.answerList.stream()
                .filter(answer -> answer.getArticleNo() == articleNo)
                .collect(Collectors.toList());
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
	
	public int getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
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

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public int getDislikeCount() {
		return dislikeCount;
	}

	public void setDislikeCount(int dislikeCount) {
		this.dislikeCount = dislikeCount;
	}


    // Constructors, getters, and setters

    // Add constructors, getters, and setters as per your requirements.
}
