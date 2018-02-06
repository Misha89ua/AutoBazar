package ua.orm.Auto_Bazar.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "car_fuel_type")
public class CarFuelType extends BaseEntity{
	
	@Column(name = "fuel_type")
	private String fuelType;
	
	@OneToMany(mappedBy = "fuelType")
	List<CarModel> modelsForFuelType = new ArrayList<>();

	public CarFuelType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarFuelType(String fuelType) {
		super();
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "CarFuelType [fuelType=" + fuelType + ", getId()=" + getId() + "]";
	}
	
	
	

}
