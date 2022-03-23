package icici.ta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import icici.ta.entity.Cus;

@Repository
public interface CustomerRepository extends JpaRepository<Cus, Integer> {
	
	
    Cus findByFirstName(String name);


	@Query("SELECT m FROM Cus m WHERE m.firstName LIKE %:fistName%")
	List<Cus> retrieveByFirstName(@Param("fistName") String fistName);
	
	
}