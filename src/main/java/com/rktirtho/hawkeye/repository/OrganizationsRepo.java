package com.rktirtho.hawkeye.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rktirtho.hawkeye.model.Organizations;

public interface OrganizationsRepo extends JpaRepository<Organizations, Integer>{
	
	List<Organizations> findByName(String name);
	List<Organizations> findByWoner(String name);
	
//	@Query("from orgnazitaions where id =0")
//	List<Organizations> findByNameExample(String name);

	
	/*findByNameOrderByWoner Desc
	 * 
	 */
	 
	
}
