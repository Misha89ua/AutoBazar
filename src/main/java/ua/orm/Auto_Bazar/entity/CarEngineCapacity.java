package ua.orm.Auto_Bazar.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "car_engine_capacity")
public class CarEngineCapacity extends BaseEntity{
	
	@Column(name = "engine_capacity")
	private Long engineCapacity;
	
	@OneToMany(mappedBy = "engineCapacity")
	List<CarModel>modelsForEngineCapacity = new ArrayList<>();

	public CarEngineCapacity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarEngineCapacity(Long engineCapacity) {
		super();
		this.engineCapacity = engineCapacity;
	}

	public Long getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(Long engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "CarEngineCapacity [engineCapacity=" + engineCapacity + ", getId()=" + getId() + "]";
	}
	
	
	

}
