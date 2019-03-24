package ltd.fyeco.soms.web.security.tokens;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityCoreVersion;

/**
 * An {@link org.springframework.security.core.Authentication} implementation
 * that is designed for simple presentation of a 手机和验证码。
 * <p>
 * The <code>principal</code> and <code>credentials</code> 应该设置为一个
 * <code>Object</code> that provides the respective property via its
 * <code>Object.toString()</code> method. The simplest such <code>Object</code>
 * to use is <code>String</code>.
 *
 * @author Tian xin
 */
public class MobileCodeAuthenticationToken extends AbstractAuthenticationToken {

	private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;

	// ~ 字段

	private final Object principal;
	private String credentials;

	// ~ 构造方法

	/**
	 * This constructor can be safely used by any code that wishes to create a
	 * <code>MobileCodeAuthenticationToken</code>, as the {@link #isAuthenticated()}
	 * will return <code>false</code>.
	 * TODO 转为中文说明
	 *
	 */
	public MobileCodeAuthenticationToken(Object principal, String credentials) {
		super(null);
		this.principal = principal;
		this.credentials = credentials;
		setAuthenticated(false);
	}

	/**
	 * 此构造函数只能由 <code>AuthenticationManager</code> 或者
	 * <code>AuthenticationProvider</code> 的满足于生成可信的实现使用 (i.e.
	 * {@link #isAuthenticated()} = <code>true</code>) authentication token.
	 *
	 * @param principal
	 * @param credentials
	 * @param authorities
	 */
	public MobileCodeAuthenticationToken(Object principal, Collection<? extends GrantedAuthority> authorities) {
		super(authorities);
		this.principal = principal;
		this.credentials = null;
		// 必须使用 super
		super.setAuthenticated(true);
	}

	// ~ 方法

	/**
	 * 获取凭证
	 */
	public String getCredentials() {
		return this.credentials;
	}

	public Object getPrincipal() {
		return this.principal;
	}

	/**
	 * 设置令牌的认证状态
	 */
	public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
		if (isAuthenticated) {
			throw new IllegalArgumentException("不能将此令牌设置为受信任 - 使用带有 GrantedAuthority 列表的构造方法替代");
		}

		super.setAuthenticated(false);
	}

	/**
	 * 擦除凭证
	 */
	@Override
	public void eraseCredentials() {
		super.eraseCredentials();
		credentials = null;
	}

}
