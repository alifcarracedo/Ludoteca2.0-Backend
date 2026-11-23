package com.ccsw.ludoteca_2_backend.client;

import com.ccsw.ludoteca_2_backend.client.model.Client;
import org.springframework.data.repository.CrudRepository;

/**
 * @author ccsw
 *
 */
public interface ClientRepository extends CrudRepository<Client, Long> {

    Client findByName(String name);

}
