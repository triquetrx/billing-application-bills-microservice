package app.netlify.triquetrx.bills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.netlify.triquetrx.bills.dto.BillsDTO;
import app.netlify.triquetrx.bills.model.Bills;
import app.netlify.triquetrx.bills.service.BillsService;

@RestController
@CrossOrigin
public class BillsController {
	
	@Autowired
	BillsService service;
	
	@GetMapping
	public ResponseEntity<?> viewAll(){
		return new ResponseEntity<>(service.viewAll(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> createNewBill(@RequestBody BillsDTO dto){
		Bills result = service.addNewBill(dto);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	
	@GetMapping("/count")
	public ResponseEntity<?> numberOfBills(){
		return new ResponseEntity<>(service.count(),HttpStatus.OK);
	}

}
