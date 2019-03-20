package ltd.fyeco.soms.domain.entity;

import java.io.Serializable;
//import java.util.Date;

//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;

import ltd.fyeco.soms.domain.BaseEntity;

@Table(name = "t_system_permission")
public class SysPermission extends BaseEntity implements Serializable {

	/**
	 * SerialVersionUID
	 */
	private static final long serialVersionUID = -3348097741408524223L;

//	private String username; // 用户名
//	private String password; // 密码
//	private String email; // 邮件
//	private String nickname; // 昵称
//	private String avatar; // 头像
//	private Integer status; // 状态:0-已冻结/1-未激活/2-已激活
	
	private String code; // 权限代码
	private String name; // 权限名称
	private String url; // 权限路径

	// Getters & Setters

//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getNickname() {
//		return nickname;
//	}
//
//	public void setNickname(String nickname) {
//		this.nickname = nickname;
//	}
//
//	public String getAvatar() {
//		return avatar;
//	}
//
//	public void setAvatar(String avatar) {
//		this.avatar = avatar;
//	}
//
//	public Integer getStatus() {
//		return status;
//	}
//
//	public void setStatus(Integer status) {
//		this.status = status;
//	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
