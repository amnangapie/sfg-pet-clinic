package ua.nure.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.nure.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
