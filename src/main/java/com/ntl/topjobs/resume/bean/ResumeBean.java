/**
 * 
 */
package com.ntl.topjobs.resume.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.ntl.topjobs.resume.service.ServiceClass;

/**
 * @author Training
 *
 */
@Entity
public class ResumeBean {
	
@Id
//@GeneratedValue(strategy=GenerationType.IDENTITY)
private String ResumeId;
private String name;
private String emailId;
private String contactNo;
private String areaOfInterest;
private String experience;
private String specialization;
private String skills;
private String secondaryCgpa;
private String seniorCgpa;
private String graduationCgpa;
private String secondarySchool;
private String seniorSchool;
private String graduationCollege;
private String postGraduationCollege;
private String postGraduationCgpa;
private String seekerId;
@Transient
ServiceClass serviceClass;

/**
 * 
 */
public ResumeBean() {
	super();
	serviceClass=new ServiceClass();
}
/**
 * @return the seekerId
 */
public String getSeekerId() {
	return seekerId;
}
/**
 * @param seekerId the seekerId to set
 */
public void setSeekerId(String seekerId) {
	this.seekerId = seekerId;
}
/**
 * @return the resumeId
 */
public String getResumeId() {
	return ResumeId;

}
/**
 * @param resumeId the resumeId to set
 */
public void setResumeId() { 
	//this.ResumeId=ResumeId;
ResumeId = serviceClass.generateResumeId();
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the emailId
 */
public String getEmailId() {
	return emailId;
}
/**
 * @param emailId the emailId to set
 */
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
/**
 * @return the contactNo
 */
public String getContactNo() {
	return contactNo;
}
/**
 * @param contactNo the contactNo to set
 */
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}
/**
 * @return the areaOfInterest
 */
public String getAreaOfInterest() {
	return areaOfInterest;
}
/**
 * @param areaOfInterest the areaOfInterest to set
 */
public void setAreaOfInterest(String areaOfInterest) {
	this.areaOfInterest = areaOfInterest;
}
/**
 * @return the experience
 */
public String getExperience() {
	return experience;
}
/**
 * @param experience the experience to set
 */
public void setExperience(String experience) {
	this.experience = experience;
}
/**
 * @return the specialization
 */
public String getSpecialization() {
	return specialization;
}
/**
 * @param specialization the specialization to set
 */
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
/**
 * @return the skills
 */
public String getSkills() {
	return skills;
}
/**
 * @param skills the skills to set
 */
public void setSkills(String skills) {
	this.skills = skills;
}
/**
 * @return the secondaryCgpa
 */
public String getSecondaryCgpa() {
	return secondaryCgpa;
}
/**
 * @param secondaryCgpa the secondaryCgpa to set
 */
public void setSecondaryCgpa(String secondaryCgpa) {
	this.secondaryCgpa = secondaryCgpa;
}
/**
 * @return the seniorCgpa
 */
public String getSeniorCgpa() {
	return seniorCgpa;
}
/**
 * @param seniorCgpa the seniorCgpa to set
 */
public void setSeniorCgpa(String seniorCgpa) {
	this.seniorCgpa = seniorCgpa;
}
/**
 * @return the graduationCgpa
 */
public String getGraduationCgpa() {
	return graduationCgpa;
}
/**
 * @param graduationCgpa the graduationCgpa to set
 */
public void setGraduationCgpa(String graduationCgpa) {
	this.graduationCgpa = graduationCgpa;
}
/**
 * @return the secondarySchool
 */
public String getSecondarySchool() {
	return secondarySchool;
}
/**
 * @param secondarySchool the secondarySchool to set
 */
public void setSecondarySchool(String secondarySchool) {
	this.secondarySchool = secondarySchool;
}
/**
 * @return the seniorSchool
 */
public String getSeniorSchool() {
	return seniorSchool;
}
/**
 * @param seniorSchool the seniorSchool to set
 */
public void setSeniorSchool(String seniorSchool) {
	this.seniorSchool = seniorSchool;
}
/**
 * @return the graduationCollege
 */
public String getGraduationCollege() {
	return graduationCollege;
}
/**
 * @param graduationCollege the graduationCollege to set
 */
public void setGraduationCollege(String graduationCollege) {
	this.graduationCollege = graduationCollege;
}
/**
 * @return the postGraduationCollege
 */
public String getPostGraduationCollege() {
	return postGraduationCollege;
}
/**
 * @param postGraduationCollege the postGraduationCollege to set
 */
public void setPostGraduationCollege(String postGraduationCollege) {
	this.postGraduationCollege = postGraduationCollege;
}
/**
 * @return the postGraduationCgpa
 */
public String getPostGraduationCgpa() {
	return postGraduationCgpa;
}
/**
 * @param postGraduationCgpa the postGraduationCgpa to set
 */
public void setPostGraduationCgpa(String postGraduationCgpa) {
	this.postGraduationCgpa = postGraduationCgpa;
}

}
