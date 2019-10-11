package com.gvsrusa.sfgpetclinic.repositories;

import com.gvsrusa.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 8/5/18.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
