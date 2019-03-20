package ltd.fyeco.soms.common.enums;

public enum Deleted {

	NORMAL(0, "NORMAL", "未删除"),
	DELETED(1, "DELETED", "已删除");

	private final Integer key;
	private final String code;
	private final String desc;

	Deleted(Integer key, String code, String desc) {
		this.key = key;
		this.code = code;
		this.desc = desc;
	}

	// Getters & Setters

	public Integer getKey() {
		return key;
	}

	public String getCode() {
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
	public static Deleted getEnumByKey(Integer key) {
		if (null == key) {
			return null;
		}
		for (Deleted deleted : Deleted.values()) {
			if (deleted.getKey().equals(key)) {
				return deleted;
			}
		}
		return null;
	}

	/**
	 * 根据枚举获得键
	 * 
	 * @param statusEnum
	 * @return
	 */
	public static Integer getEnumKey(UserStatus statusEnum) {
		return statusEnum.getKey();
	}

}
