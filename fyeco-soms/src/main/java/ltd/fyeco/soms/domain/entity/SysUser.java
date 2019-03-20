package ltd.fyeco.soms.domain.entity;

import java.io.Serializable;
//import java.util.Date;
import java.util.List;

//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;

import ltd.fyeco.soms.domain.BaseEntity;

/**
 * @author tianxin
 */
@Table(name = "t_sys_user")
public class SysUser extends BaseEntity implements Serializable {

	/**
	 * SerialVersionUID
	 */
	private static final long serialVersionUID = -3348097741408524223L;

	/** 用户名 */
	private String username;

	 /** 密码 */
	private String password;

	 /** 邮件 */
	private String email;

	 /** 昵称 */
	private String nickname;

	 /** 头像 */
	private String avatar;

	 /** 状态:0-已冻结/1-未激活/2-已激活 */
	private Integer status;

	 /** 角色 */
	private List<SysRole> roles;

	// Getters & Setters

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<SysRole> getRoles() {
		return roles;
	}

	public void setRoles(List<SysRole> roles) {
		this.roles = roles;
	}

}
