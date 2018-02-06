package ua.orm.Auto_Bazar.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Car_make")
public class CarMake extends BaseEntity{
	
	@Column(name = "make_title")
	private String makeTitle;
	
	@Column(name = "manufacture_year")
	private int manufactyreYear;
	
	@OneToOne
	@JoinColumn(name = "model_id")
	private CarModel model;
	
	@OneToMany(mappedBy = "make")
	private List<Car> carsForMake = new ArrayList<>();

	public CarMake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarMake(String makeTitle, int manufactyreYear) {
		super();
		this.makeTitle = makeTitle;
		this.manufactyreYear = manufactyreYear;
	}

	public String getMakeTitle() {
		return makeTitle;
	}

	public void setMakeTitle(String makeTitle) {
		this.makeTitle = makeTitle;
	}

	public int getManufactyreYear() {
		return manufactyreYear;
	}

	public void setManufactyreYear(int manufactyreYear) {
		this.manufactyreYear = manufactyreYear;
	}

	public CarModel getModelId() {
		return model;
	}

	public void setModelId(CarModel modelId) {
		this.model = modelId;
	}
	
	

	public List<Car> getCarsForMake() {
		return carsForMake;
	}

	public void setCarsForMake(List<Car> carsForMake) {
		this.carsForMake = carsForMake;
	}

	@Override
	public String toString() {
		return "CarMake [makeTitle=" + makeTitle + ", manufactyreYear=" + manufactyreYear + ", model=" + model
				+ ", getId()=" + getId() + "]";
	}
	
}
