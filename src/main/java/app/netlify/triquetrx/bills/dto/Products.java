package app.netlify.triquetrx.bills.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public @NoArgsConstructor @AllArgsConstructor @Data class Products {

	private int id;
	private String productName;
	private String productType;
	private String hsn;
	private double basic;
	private double gst;
	private int qty;
	private double total;

}
