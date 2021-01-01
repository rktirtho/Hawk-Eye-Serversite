package com.rktirtho.hawkeye.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rktirtho.hawkeye.dto.PermittedDetails;
import com.rktirtho.hawkeye.model.Permitted;

public interface PermittRepo extends JpaRepository<Permitted, Integer>{
	
//	@Query()
//	List<PermittedDetails> getPermittedWithOrgName();
	
	@Query(value = "select permitted.id, permitted.name, permitted.org_id, permitted.image_id, organizations.name as org_name, permitted.regestered_time from permitted join organizations on permitted.org_id = organizations.id", nativeQuery = true)
	List<Object> getAllPermitteds();

}
