package com.Ponnam.DMS.repository;
import java.util.List;
/*
 * @author Ponnam S555255
 * */
import org.springframework.data.repository.CrudRepository;

import com.Ponnam.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}