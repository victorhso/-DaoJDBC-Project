package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String email;
	private Date bithDate;
	private Double baseSalary;
	
	private Department department;
	
	public Seller() {
		
	}

	public Seller(Integer id, String name, String email, Date bithDate, Double baseSalary, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.bithDate = bithDate;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBithDate() {
		return bithDate;
	}

	public void setBithDate(Date bithDate) {
		this.bithDate = bithDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Seller other = (Seller) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", bithDate=" + bithDate + ", baseSalary="
				+ baseSalary + ", department=" + department + "]";
	}
}
