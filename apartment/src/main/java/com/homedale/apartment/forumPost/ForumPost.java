package com.homedale.apartment.forumPost;
import java.time.LocalDateTime;
import jakarta.persistence.OneToMany;
import java.util.List;
import com.homedale.apartment.forumComments.ForumComments;
import com.homedale.apartment.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "forum_posts")
public class ForumPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;
    
    private String postType;
    private String content;
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "forumPost", cascade = CascadeType.ALL)
    private List<ForumComments> comments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public List<ForumComments> getComments() {
		return comments;
	}

	public void setComments(List<ForumComments> comments) {
		this.comments = comments;
	}
    
    
    
    
}
