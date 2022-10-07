import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Customer {

	public static void main(String[] args) throws Exception {
		
		
		}
		}


class Product{
private String productId;
private String productName;
private String productDescription;
private String price;
private String quantity;
private String category;
public Product(String productId, String productName, String productDescription, String price, String quantity,
		String category) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productDescription = productDescription;
	this.price = price;
	this.quantity = quantity;
	this.category = category;
}
public String getProductId() {
	return productId;
}
public String getProductName() {
	return productName;
}
public String getProductDescription() {
	return productDescription;
}
public String getPrice() {
	return price;
}
public String getQuantity() {
	return quantity;
}
public String getCategory() {
	return category;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
			+ productDescription + ", price=" + price + ", quantity=" + quantity + ", category=" + category + "]";
}


}
class OrderItem {
private String orderId;
private String customerId;
private String status;
private String street;
private String city;
private String zip;
private String totalamount;
private String orderDate;
private String deliveryDate;
public OrderItem(String orderId, String customerId, String status, String street, String city, String zip,
		String totalamount, String orderDate, String deliveryDate) {
	super();
	this.orderId = orderId;
	this.customerId = customerId;
	this.status = status;
	this.street = street;
	this.city = city;
	this.zip = zip;
	this.totalamount = totalamount;
	this.orderDate = orderDate;
	this.deliveryDate = deliveryDate;
}
public String getOrderId() {
	return orderId;
}
public String getCustomerId() {
	return customerId;
}
public String getStatus() {
	return status;
}
public String getStreet() {
	return street;
}
public String getCity() {
	return city;
}
public String getZip() {
	return zip;
}
public String getTotalamount() {
	return totalamount;
}
public String getOrderDate() {
	return orderDate;
}
public String getDeliveryDate() {
	return deliveryDate;
}
@Override
public String toString() {
	return "OrderItem [orderId=" + orderId + ", customerId=" + customerId + ", status=" + status + ", street=" + street
			+ ", city=" + city + ", zip=" + zip + ", totalamount=" + totalamount + ", orderDate=" + orderDate
			+ ", deliveryDate=" + deliveryDate + "]";
}


}










