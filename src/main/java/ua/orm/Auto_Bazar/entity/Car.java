package ua.orm.Auto_Bazar.entity;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car extends BaseEntity {
	
	@Column(name = "sell_price")
	private Long sellPrice;
	
	@ManyToOne
	@JoinColumn(name = "make_id")
	private CarMake make;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private CarSeller seller;

	public Car() {
	}

	public Car(Long sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Long getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Long sellPrice) {
		this.sellPrice = sellPrice;
	}

	public CarMake getMake() {
		return make;
	}

	public void setMake(CarMake make) {
		this.make = make;
	}

	public CarSeller getSeller() {
		return seller;
	}

	public void setSeller(CarSeller seller) {
		this.seller = seller;
	}

	@Override
	public String toString() {
		return "Car [sellPrice=" + sellPrice + ", make=" + make + ", seller=" + seller + ", getId()=" + getId() + "]";
	}
	
	


	
	
}
