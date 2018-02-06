package ua.orm.Auto_Bazar.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "car_seller")
public class CarSeller extends BaseEntity{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "phone_number")
	private int phoneNumber;
	
	@OneToMany(mappedBy = "seller")
	private List<Car> carsForSeller = new ArrayList<>();

	public CarSeller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarSeller(String firstName, String lastName, int age, int phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Car> getCarsForSeller() {
		return carsForSeller;
	}

	public void setCarsForSeller(List<Car> carsForSeller) {
		this.carsForSeller = carsForSeller;
	}

	@Override
	public String toString() {
		return "CarSeller [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phoneNumber="
				+ phoneNumber + ", getId()=" + getId() + "]";
	}
	
	
	

}
