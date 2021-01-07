package com.rktirtho.hawkeye.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.rktirtho.hawkeye.model.PermitArea;

@Component
public interface PermitAreaRepo extends JpaRepository<PermitArea, Integer>{
	
	public List<PermitArea> findPermitAreaByPersonId(int id);
	
//	public List<PermitArea> findPermitAreaByPersonIdAnd

}
