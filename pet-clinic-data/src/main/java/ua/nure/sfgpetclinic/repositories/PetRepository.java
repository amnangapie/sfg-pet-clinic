package ua.nure.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.nure.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
