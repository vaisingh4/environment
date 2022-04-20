package com.sirionlabs.environment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SirionEnvironment {

	@Id
	private int id;
	private String clientName;
	private String sftpSdboxHost;
	private String sftpSdboxPassword;
	private String sirionSdboxEndUserHost;
	private String sirionSdboxEndUserName;
	private String sirionSdboxEndUserPassword;
	private String sirionProdEndUserHost;
	private String sirionProdEndUserName;
	private String sirionProdEndUserPassword;
	private String sftpProdHost;
	private String sftpProdPassword;
	private String sirionSdboxAdminUserHost;
	private String sirionSdboxAdminUserName;
	private String sirionSdboxAdminUserPassword;
	private String sirionProdAdminUserHost;
	private String sirionProdAdminUserName;
	private String sirionProdAdminUserPassword;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getSftpSdboxHost() {
		return sftpSdboxHost;
	}

	public void setSftpSdboxHost(String sftpSdboxHost) {
		this.sftpSdboxHost = sftpSdboxHost;
	}

	public String getSftpSdboxPassword() {
		return sftpSdboxPassword;
	}

	public void setSftpSdboxPassword(String sftpSdboxPassword) {
		this.sftpSdboxPassword = sftpSdboxPassword;
	}

	public String getSirionSdboxEndUserHost() {
		return sirionSdboxEndUserHost;
	}

	public void setSirionSdboxEndUserHost(String sirionSdboxEndUserHost) {
		this.sirionSdboxEndUserHost = sirionSdboxEndUserHost;
	}

	public String getSirionSdboxEndUserName() {
		return sirionSdboxEndUserName;
	}

	public void setSirionSdboxEndUserName(String sirionSdboxEndUserName) {
		this.sirionSdboxEndUserName = sirionSdboxEndUserName;
	}

	public String getSirionSdboxEndUserPassword() {
		return sirionSdboxEndUserPassword;
	}

	public void setSirionSdboxEndUserPassword(String sirionSdboxEndUserPassword) {
		this.sirionSdboxEndUserPassword = sirionSdboxEndUserPassword;
	}

	public String getSirionProdEndUserHost() {
		return sirionProdEndUserHost;
	}

	public void setSirionProdEndUserHost(String sirionProdEndUserHost) {
		this.sirionProdEndUserHost = sirionProdEndUserHost;
	}

	public String getSirionProdEndUserName() {
		return sirionProdEndUserName;
	}

	public void setSirionProdEndUserName(String sirionProdEndUserName) {
		this.sirionProdEndUserName = sirionProdEndUserName;
	}

	public String getSirionProdEndUserPassword() {
		return sirionProdEndUserPassword;
	}

	public void setSirionProdEndUserPassword(String sirionProdEndUserPassword) {
		this.sirionProdEndUserPassword = sirionProdEndUserPassword;
	}

	public String getSftpProdHost() {
		return sftpProdHost;
	}

	public void setSftpProdHost(String sftpProdHost) {
		this.sftpProdHost = sftpProdHost;
	}

	public String getSftpProdPassword() {
		return sftpProdPassword;
	}

	public void setSftpProdPassword(String sftpProdPassword) {
		this.sftpProdPassword = sftpProdPassword;
	}

	public String getSirionSdboxAdminUserHost() {
		return sirionSdboxAdminUserHost;
	}

	public void setSirionSdboxAdminUserHost(String sirionSdboxAdminUserHost) {
		this.sirionSdboxAdminUserHost = sirionSdboxAdminUserHost;
	}

	public String getSirionSdboxAdminUserName() {
		return sirionSdboxAdminUserName;
	}

	public void setSirionSdboxAdminUserName(String sirionSdboxAdminUserName) {
		this.sirionSdboxAdminUserName = sirionSdboxAdminUserName;
	}

	public String getSirionSdboxAdminUserPassword() {
		return sirionSdboxAdminUserPassword;
	}

	public void setSirionSdboxAdminUserPassword(String sirionSdboxAdminUserPassword) {
		this.sirionSdboxAdminUserPassword = sirionSdboxAdminUserPassword;
	}

	public String getSirionProdAdminUserHost() {
		return sirionProdAdminUserHost;
	}

	public void setSirionProdAdminUserHost(String sirionProdAdminUserHost) {
		this.sirionProdAdminUserHost = sirionProdAdminUserHost;
	}

	public String getSirionProdAdminUserName() {
		return sirionProdAdminUserName;
	}

	public void setSirionProdAdminUserName(String sirionProdAdminUserName) {
		this.sirionProdAdminUserName = sirionProdAdminUserName;
	}

	public String getSirionProdAdminUserPassword() {
		return sirionProdAdminUserPassword;
	}

	public void setSirionProdAdminUserPassword(String sirionProdAdminUserPassword) {
		this.sirionProdAdminUserPassword = sirionProdAdminUserPassword;
	}

	@Override
	public String toString() {
		return "SirionEnvironement [id=" + id + ", clientName=" + clientName + ", sftpSdboxHost=" + sftpSdboxHost
				+ ", sftpSdboxPassword=" + sftpSdboxPassword + ", sirionSdboxEndUserHost=" + sirionSdboxEndUserHost
				+ ", sirionSdboxEndUserName=" + sirionSdboxEndUserName + ", sirionSdboxEndUserPassword="
				+ sirionSdboxEndUserPassword + ", sirionProdEndUserHost=" + sirionProdEndUserHost
				+ ", sirionProdEndUserName=" + sirionProdEndUserName + ", sirionProdEndUserPassword="
				+ sirionProdEndUserPassword + ", sftpProdHost=" + sftpProdHost + ", sftpProdPassword="
				+ sftpProdPassword + ", sirionSdboxAdminUserHost=" + sirionSdboxAdminUserHost
				+ ", sirionSdboxAdminUserName=" + sirionSdboxAdminUserName + ", sirionSdboxAdminUserPassword="
				+ sirionSdboxAdminUserPassword + ", sirionProdAdminUserHost=" + sirionProdAdminUserHost
				+ ", sirionProdAdminUserName=" + sirionProdAdminUserName + ", sirionProdAdminUserPassword="
				+ sirionProdAdminUserPassword + "]";
	}

}
