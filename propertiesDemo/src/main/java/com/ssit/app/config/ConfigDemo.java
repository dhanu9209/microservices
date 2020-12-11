package com.ssit.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "config")
public class ConfigDemo {

private String host;
private String port;
private String userName;
private ThirdPary thirdparty;




public String getHost() {
	return host;
}




public void setHost(String host) {
	this.host = host;
}




public String getPort() {
	return port;
}




public void setPort(String port) {
	this.port = port;
}




public String getUserName() {
	return userName;
}




public void setUserName(String userName) {
	this.userName = userName;
}




public ThirdPary getThirdparty() {
	return thirdparty;
}




public void setThirdparty(ThirdPary thirdparty) {
	this.thirdparty = thirdparty;
}




@Data
public
static class ThirdPary{
	private String host;
	private String port;
	private String userName;
	public ThirdPary(String host, String port, String userName) {
		super();
		this.host = host;
		this.port = port;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "ThirdPary [host=" + host + ", port=" + port + ", UserName=" + userName + "]";
	}
	public ThirdPary() {
		super();
	}
	
	
}




@Override
public String toString() {
	return "ConfigDemo [host=" + host + ", port=" + port + ", UserName=" + userName + ", thirdparty=" + thirdparty
			+ "]";
}

}



