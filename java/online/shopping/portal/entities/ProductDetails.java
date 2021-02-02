package online.shopping.portal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Product_Details")
public class ProductDetails {

	private int productID;
	private String productCategory;
	private double discount;
	private String short_description;
	private String ratings;
	private String feedback;
	private String image;
	private String brand;
	private String color;
	private String size;
	private double prize;
	
	public ProductDetails() {
		
	}

	public ProductDetails(int productID, String productCategory, double discount, String short_description,
			String feedback, String image, String brand, String color, String size, double prize) {
		super();
		this.productID = productID;
		this.productCategory = productCategory;
		this.discount = discount;
		this.short_description = short_description;
		this.ratings=ratings;
		this.feedback = feedback;
		this.image = image;
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.prize= prize;
	}
  
    @GenericGenerator(name="gen", strategy="native")
    @GeneratedValue(generator="gen")
	@Id
	@Column
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}
   
	@Column
	public String getProductCategory() {
		return productCategory;
	}

	@Column
	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	@Column
	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Column
	public String getShort_description() {
		return short_description;
	}

	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}
	@Column
	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	
	
	@Column
	public String getFeedback() {
		return feedback;
	}

	
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Column
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	@Column
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Column
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Column
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "ProductDetails [productID=" + productID + ", productCategory=" + productCategory + ", discount="
				+ discount + ", short_description=" + short_description + ", ratings=" + ratings + ", feedback="
				+ feedback + ", image=" + image + ", brand=" + brand + ", color=" + color + ", size=" + size
				+ ", prize=" + prize + "]";
	}

	
	
	
	 
}
