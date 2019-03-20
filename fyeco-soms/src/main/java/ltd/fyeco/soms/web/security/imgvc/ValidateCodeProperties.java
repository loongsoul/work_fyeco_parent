package ltd.fyeco.soms.web.security.imgvc;

public class ValidateCodeProperties {
	  /**
     * 图形验证码 配置属性
     */
    private ImageCodeProperties image = new ImageCodeProperties();

	public ImageCodeProperties getImage() {
		return image;
	}

	public void setImage(ImageCodeProperties image) {
		this.image = image;
	}
}
