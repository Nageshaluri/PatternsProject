package com.aluriClasses.DMS.repository;

import java.util.List;



import org.springframework.data.repository.CrudRepository;

import com.aluriClasses.DMS.Models.Dog;

/**
*
* @author Nagesh Aluri
*/

public interface DogRepository extends CrudRepository<Dog,Integer> {
	
	List<Dog>findByName(String name);

}
