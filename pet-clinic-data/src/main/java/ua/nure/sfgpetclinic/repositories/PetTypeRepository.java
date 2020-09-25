package ua.nure.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.nure.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
