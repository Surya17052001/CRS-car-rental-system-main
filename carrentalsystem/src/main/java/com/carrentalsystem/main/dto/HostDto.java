package com.carrentalsystem.main.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class HostDto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String hostEmail;
	private String hostPass;
	private String hostName;
	private String hostContact;
	public String getHostEmail() {
		return hostEmail;
	}
	public void setHostEmail(String hostEmail) {
		this.hostEmail = hostEmail;
	}
	public String getHostPass() {
		return hostPass;
	}
	public void setHostPass(String hostPass) {
		this.hostPass = hostPass;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getHostContact() {
		return hostContact;
	}
	public void setHostContact(String hostContact) {
		this.hostContact = hostContact;
	}
	
}
