package cn.itcast.enums;

/**
 * 使用枚举表述常量的状态
 */
public  class WizardAuditEnum {
	public enum StatusEnum {

		STATUS_SUCCESS(10, "成功"), STATUS_FAIL(20,"失败");

		private int value;

		private String desc;

		private StatusEnum(int value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public static String getDesc(Integer value) {
			for (StatusEnum status : StatusEnum.values()) {
				if (status.getValue() == (value)) {
					return status.desc;
				}
			}
			return null;
		}

	}
}

