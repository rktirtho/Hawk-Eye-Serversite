package com.rktirtho.hawkeye.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rktirtho.hawkeye.dto.PermittedDetails;
import com.rktirtho.hawkeye.model.Permitted;

public interface PermittRepo extends JpaRepository<Permitted, Integer>{
	
	
	List<Permitted> findByOrgId(int id);
	
	@Query(value = "select p.id, p.name, p.org_id, p.image_id, o.name as org_name, p.regestered_time from permitted p join organizations o on p.org_id = o.id", nativeQuery = true)
	List<Permitted> getAllPermitteds();
	
	@Query(value = "select * from permitted ", nativeQuery = true)
	List<Permitted> getAllTest();


}
