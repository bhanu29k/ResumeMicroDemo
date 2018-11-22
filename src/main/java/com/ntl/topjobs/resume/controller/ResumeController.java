/**
 * 
 */
package com.ntl.topjobs.resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntl.topjobs.resume.bean.ResumeBean;
import com.ntl.topjobs.resume.service.ServiceClass;

/**
 * @author Training
 *
 */
@RestController
public class ResumeController {

	@Autowired
	ServiceClass serviceClass;
	
	@PostMapping("/seeker/postresume")
	public ResumeBean postResume(@RequestBody ResumeBean resumeBean)
	{
		return serviceClass.addResume(resumeBean);
	}
	
}
