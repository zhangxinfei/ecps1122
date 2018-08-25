package cn.itcast.enums;

/**
 * 使用枚举表述常量的状态
 */
public  class WizardAuditEnum {
	public enum StatusEnum {

		STATUS_SUCCESS(10, "存在"), STATUS_FAIL(20,"不存在");

		private int state;

		private String stateInfo;

		private StatusEnum(int state, String stateInfo) {
			this.state = state;
			this.stateInfo = stateInfo;
		}

		public int getState() {
			return state;
		}

		public String getStateInfo() {
			return stateInfo;
		}

		public void setState(int state) {
			this.state = state;
		}

		public void setStateInfo(String stateInfo) {
			this.stateInfo = stateInfo;
		}

		public static StatusEnum stateOf(int index) {
			for (StatusEnum state : values()) {
				if (state.getState() == index) {
					return state;
				}

			}
			return null;
		}

	}
}

