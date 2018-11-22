/**
 * 
 */
package com.ntl.topjobs.resume.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntl.topjobs.resume.bean.ResumeBean;

/**
 * @author Training
 *
 */
@Repository
public interface ResumeDao extends JpaRepository<ResumeBean,String> {
//@Query(value="insert into Resume_Bean (resume_id,name,email_id,contact_no,area_of_interest,experience,specialization,skills,secondary_cgpa,senior_cgpa,graduation_cgpa,secondary_school,senior_school,graduation_college,post_graduation_cgpa,post_graduation_college,user_id) values ")

}
