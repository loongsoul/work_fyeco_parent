package ltd.fyeco.soms.common.enums;

public enum UserStatus {
	
	FROZEN(-1,"FROZEN","已冻结"),
	INACTIVE(0,"INACTIVE","未激活"),
	ACTIVED(1,"ACTIVED","已激活");

	private final Integer key;
	private final String code;
	private final String desc;

	private UserStatus(Integer key, String code, String desc) {
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
	public static UserStatus getEnumByKey(Integer key) {
		if (null == key) {
			return null;
		}
		for (UserStatus status : UserStatus.values()) {
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
	public static Integer getEnumKey(UserStatus statusEnum) {
		return statusEnum.getKey();
	}

}
