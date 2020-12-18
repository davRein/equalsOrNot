package de.dreinerts.equalsOrNot;

import java.util.Objects;

public class isEqu {

	public isEqu() {
		// TODO Auto-generated constructor stub
	}

	public isEqu(String strName, String strLastname) {
		this.strLastname = strLastname;
		this.strName = strName;
	}

	private String strName, strLastname;
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} else if (this == o) {
			return true;
		} else if (getClass() != o.getClass()) {
			return false;
		} else if (o instanceof isEqu) {
			return true;
		}
		isEqu e = (isEqu) o;
		return Objects.equals(strLastname, e.strLastname) && Objects.equals(strName, e.strName);
	}
	
	public int hashCode() {
		return Objects.hash(strLastname, strName);
	}
}
