package com.dashboard.summary.dashboard.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseBean<T> {

	private String responseCode;
	private String responseMsg;
	private String errorStack;
	private long timeStamp = System.currentTimeMillis();
	private String appVersion;
	private T responseObj;

	public ResponseBean(T responseObj) {
		super();
		this.responseObj = responseObj;
	}

	public ResponseBean(String responseCode, String responseMsg, T responseObj) {
		super();
		this.responseCode = responseCode;
		this.responseMsg = responseMsg;
		this.responseObj = responseObj;
	}

	public ResponseBean(String responseCode, String responseMsg) {
		super();
		this.responseCode = responseCode;
		this.responseMsg = responseMsg;
	}

	public ResponseBean(String responseCode, String responseMsg, String errorStack) {
		super();
		this.responseCode = responseCode;
		this.responseMsg = responseMsg;
		this.setErrorStack(errorStack);
	}

	public ResponseBean() {
		super();
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public T getResponseObj() {
		return responseObj;
	}

	public void setResponseObj(T responseObj) {
		this.responseObj = responseObj;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getAppVersion() { return appVersion; }

	public void setAppVersion(String appVersion) { this.appVersion = appVersion; }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((responseObj == null) ? 0 : responseObj.hashCode());
		result = prime * result + ((responseCode == null) ? 0 : responseCode.hashCode());
		result = prime * result + ((responseMsg == null) ? 0 : responseMsg.hashCode());
		result = prime * result + (int) (timeStamp ^ (timeStamp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseBean other = (ResponseBean) obj;
		if (responseObj == null) {
			if (other.responseObj != null)
				return false;
		} else if (!responseObj.equals(other.responseObj))
			return false;
		if (responseCode == null) {
			if (other.responseCode != null)
				return false;
		} else if (!responseCode.equals(other.responseCode))
			return false;
		if (responseMsg == null) {
			if (other.responseMsg != null)
				return false;
		} else if (!responseMsg.equals(other.responseMsg))
			return false;
		if (timeStamp != other.timeStamp)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GeneralResponseBean [responseCode=" + responseCode + ", responseMsg=" + responseMsg + ", timeStamp="
				+ timeStamp + ", responseObj=" + responseObj + "]";
	}

	public String getErrorStack() {
		return errorStack;
	}

	public void setErrorStack(String errorStack) {
		this.errorStack = errorStack;
	}

}
