package ua.orm.Auto_Bazar.entity;

import javax.persistence.*;

@Entity
@Table(name = "Car_model")
public class CarModel extends BaseEntity{
	
	@Column(name = "model_title")
	private String modelTitle;
	
	@ManyToOne
	@JoinColumn(name = "engine_capacity_id")
	private CarEngineCapacity engineCapacity;
	
	@ManyToOne
	@JoinColumn(name = "fuel_type_id")
	private CarFuelType fuelType;
	
	@ManyToOne
	@JoinColumn(name = "color_id")
	private CarColor color;
	
	@OneToOne(mappedBy = "model")
	private CarMake make;

	public CarModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarModel(String modelTitle) {
		super();
		this.modelTitle = modelTitle;
	}

	public String getModelTitle() {
		return modelTitle;
	}

	public void setModelTitle(String modelTitle) {
		this.modelTitle = modelTitle;
	}

	
	
	public CarEngineCapacity getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(CarEngineCapacity engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public CarFuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(CarFuelType fuelType) {
		this.fuelType = fuelType;
	}

	public CarColor getColor() {
		return color;
	}

	public void setColor(CarColor color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CarModel [modelTitle=" + modelTitle + ", engineCapacity=" + engineCapacity + ", fuelType=" + fuelType
				+ ", color=" + color + ", getId()=" + getId() + "]";
	}
	
}
