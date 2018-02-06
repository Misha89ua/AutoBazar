package ua.orm.Auto_Bazar.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Car_color")
public class CarColor extends BaseEntity{
	
	@Column(name = "color")
	private String color;
	
	@OneToMany(mappedBy = "color")
	List<CarModel> modelsForColor = new ArrayList<>();

	public CarColor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarColor(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CarColor [color=" + color + ", getId()=" + getId() + "]";
	}
		
}
