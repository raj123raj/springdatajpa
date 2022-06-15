package com.gfg.repository;  
import org.springframework.data.repository.CrudRepository;

import com.gfg.model.GeekUserRecord;  
public interface GeekUserRepository extends CrudRepository<GeekUserRecord, String> 
{  
}  
