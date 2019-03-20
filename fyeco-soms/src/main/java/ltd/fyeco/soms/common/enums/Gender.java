package ltd.fyeco.soms.common.enums;

/**
 * 性别美剧
 * @author tianxin
 *
 */
public enum Gender {

	FEMALE(0, "FEMALE", "女"),
	MALE(1, "MALE", "男"),
	SECRET(2, "SECRET", "保密");

	private final Integer key;
	private final String code;
	private final String desc;

	private Gender(Integer key, String code, String desc) {
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
	public static Gender getEnumByKey(Integer key) {
		if (null == key) {
			return null;
		}
		for (Gender status : Gender.values()) {
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
