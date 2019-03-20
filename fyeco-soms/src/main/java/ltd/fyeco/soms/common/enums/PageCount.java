package ltd.fyeco.soms.common.enums;

/**
 * 分页是否统计总数
 * @author tianxin
 *
 */
public enum PageCount {

	FALSE(0, false, "否"),
	TRUE(1, true, "是");

	private final Integer key;
	private final Boolean code;
	private final String desc;

	private PageCount(Integer key, Boolean code, String desc) {
		this.key = key;
		this.code = code;
		this.desc = desc;
	}

	// Getters & Setters

	public Integer getKey() {
		return key;
	}

	public Boolean getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	// Methods

	/**
	 * 根据键获得枚举
	 * 
	 * @param key
	 * @return
	 */
	public static PageCount getEnumByKey(Integer key) {
		if (null == key) {
			return null;
		}
		for (PageCount status : PageCount.values()) {
			if (status.getKey().equals(key)) {
				return status;
			}
		}
		return null;
	}

	/**
	 * 根据枚举获得键
	 * 
	 * @param key
	 * @return
	 */
	public static Integer getEnumKey(PageCount isCount) {
		return isCount.getKey();
	}

}
