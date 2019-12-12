package fiap.scj34.rest.models;

public class Vehicle {
	
	private Integer id;
	private String brand;
	private String model;
	private String plate;
	private Integer year;
	private String color;
	
	public Vehicle(Integer id, String brand, String model, String plate, Integer year, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.plate = plate;
		this.year = year;
		this.color = color;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
