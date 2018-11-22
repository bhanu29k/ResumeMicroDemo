/**
 * 
 */
package com.ntl.topjobs.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntl.topjobs.resume.bean.ResumeBean;
import com.ntl.topjobs.resume.dao.ResumeDao;

/**
 * @author Training
 *
 */
@Service
public class ServiceClass {

	@Autowired 
	ResumeDao resumeDao;
	public ResumeBean addResume(ResumeBean resumeBean) {
		resumeBean.setResumeId();
		return resumeDao.save(resumeBean);
	}
	public String generateResumeId() {
		int x = (int)(Math.random()*((9999-1000)+1))+1000;
		 String str=Integer.toString(x);
		char a[]= {str.charAt(0),str.charAt(1),str.charAt(2),str.charAt(3)};
		return (new String(a));
	}

}
