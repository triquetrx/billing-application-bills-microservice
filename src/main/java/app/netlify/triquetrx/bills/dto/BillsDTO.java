package app.netlify.triquetrx.bills.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public @Data @AllArgsConstructor @NoArgsConstructor class BillsDTO {
	
	private int customerId;
	private String customerName;
	private List<Products> products;
}
