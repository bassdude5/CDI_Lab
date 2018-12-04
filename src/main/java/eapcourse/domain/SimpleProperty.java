package eapcourse.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SimpleProperty {

	@Id
	private String key;
	private String value;

	public final String getKey() {
		return key;
	}

	public final void setKey(final String key) {
		this.key = key;
	}

	public final String getValue() {
		return value;
	}

	public final void setValue(final String value) {
		this.value = value;
	}

	@Override
	public final String toString() {
		return "SimpleProperty [key=" + getKey() + ", value=" + value + "]";
	}

}