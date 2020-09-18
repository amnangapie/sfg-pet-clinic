package ua.nure.sfgpetclinic.services;

import ua.nure.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
