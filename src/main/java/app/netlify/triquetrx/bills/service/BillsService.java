package app.netlify.triquetrx.bills.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.netlify.triquetrx.bills.dto.BillsDTO;
import app.netlify.triquetrx.bills.dto.Products;
import app.netlify.triquetrx.bills.model.Bills;
import app.netlify.triquetrx.bills.repository.BillsRepository;

@Service
public class BillsService {
	
	@Autowired
	private BillsRepository repository;
	
	public List<Bills> viewAll(){
		return repository.findAll();
	}
	
	public Bills addNewBill(BillsDTO dto) {
		int numberOfProducts = dto.getProducts().size();
		String products = "";
		Bills addTo = new Bills();
		double total = 0;
		List<Products> productsList = dto.getProducts();
		dto.getProducts().parallelStream().forEach(ele->addTo.setProductsId((ele.getId()+",").repeat(ele.getQty())));
		for(int i=0;i<numberOfProducts;i++) {
			Products dummy = productsList.get(i);
			int id = dummy.getId();
			int qty = dummy.getQty();
			for(int j=0;j<qty;j++) {
				products+=id+",";
			}
			total += dummy.getTotal();
		}
		return repository.save(new Bills(dto.getCustomerId(), new Date(), dto.getCustomerName(), products.substring(0, products.length()-1), numberOfProducts, total));
		
	}

	public long count() {
		return repository.count();
	}

}
