package com.myRetail.retail.api.request;

import com.myRetail.retail.api.model.CurrencyCode;

public class PriceRequest {
	private double value;

	private CurrencyCode code;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public CurrencyCode getCode() {
		return code;
	}

	public void setCode(CurrencyCode code) {
		this.code = code;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		PriceRequest other = (PriceRequest) obj;
		if (code != other.code)
			return false;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PriceRequest [value=" + value + ", code=" + code + "]";
	}


}
