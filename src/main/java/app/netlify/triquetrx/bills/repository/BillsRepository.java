package app.netlify.triquetrx.bills.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.netlify.triquetrx.bills.model.Bills;

@Repository
public interface BillsRepository extends JpaRepository<Bills, Integer> {

}
