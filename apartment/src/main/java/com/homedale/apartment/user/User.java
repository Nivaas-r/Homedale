package com.homedale.apartment.user;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import com.homedale.apartment.forumPost.ForumPost;
import com.homedale.apartment.serviceRequest.ServiceRequest;
import com.homedale.apartment.visitorAccess.VisitorAccess;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String flatNumber;
    private String familyMembers;
    private String vehicleDetails;
    private String role;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<ServiceRequest> serviceRequests;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<VisitorAccess> visitors;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<ForumPost> forumPosts;
    
    
    
    private Long id;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getFamilyMembers() {
		return familyMembers;
	}

	public void setFamilyMembers(String familyMembers) {
		this.familyMembers = familyMembers;
	}

	public String getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(String vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<ServiceRequest> getServiceRequests() {
		return serviceRequests;
	}

	public void setServiceRequests(List<ServiceRequest> serviceRequests) {
		this.serviceRequests = serviceRequests;
	}

	public List<VisitorAccess> getVisitors() {
		return visitors;
	}

	public void setVisitors(List<VisitorAccess> visitors) {
		this.visitors = visitors;
	}

	public List<ForumPost> getForumPosts() {
		return forumPosts;
	}

	public void setForumPosts(List<ForumPost> forumPosts) {
		this.forumPosts = forumPosts;
	}
}