package app.netlify.triquetrx.bills.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
public @NoArgsConstructor @Data class Bills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int customerId;
	private Date dateCreated;
	private String customerName;
	private String productsId;
	private int numberOfProduct;
	private double total;

	public Bills(int customerId, Date dateCreated, String customerName, String productsId, int numberOfProduct,
			double total) {
		super();
		this.customerId = customerId;
		this.dateCreated = dateCreated;
		this.customerName = customerName;
		this.productsId = productsId;
		this.numberOfProduct = numberOfProduct;
		this.total = total;
	}

}
