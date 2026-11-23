package com.ccsw.ludoteca_2_backend.client;

import com.ccsw.ludoteca_2_backend.client.model.Client;
import com.ccsw.ludoteca_2_backend.client.model.ClientDto;
import com.ccsw.ludoteca_2_backend.loan.model.Loan;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * @author ccsw
 *
 */
@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    private LoanRepository loanRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Client> findAll() {

        return (List<Client>) this.clientRepository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    public void save(Long id, ClientDto dto) {

        Client existingClient = clientRepository.findByName(dto.getName());

        if (id == null) {

            if (existingClient != null) {
                throw new ClientException("Ya existe un cliente con ese nombre");
            }

            Client client = new Client();
            client.setName(dto.getName());
            clientRepository.save(client);

        } else {

            Client client = clientRepository.findById(id).orElseThrow();

            if (existingClient != null && !existingClient.getId().equals(client.getId())) {

                throw new ClientException("Ya existe un cliente con ese nombre");
            }

            client.setName(dto.getName());
            clientRepository.save(client);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Long id) throws Exception {

        if (this.clientRepository.findById(id).orElse(null) == null) {
            throw new Exception("Not exists");
        }

        List<Loan> loans = this.loanRepository.findByClient_Id(id);
        LocalDate today = LocalDate.now();

        for (Loan loan : loans) {
            boolean active = !today.isBefore(loan.getLoanDate()) && !today.isAfter(loan.getReturnDate());
            if (active) {
                throw new ClientException("No se puede eliminar un cliente con préstamos activos");
            }
        }

        this.clientRepository.deleteById(id);
    }

}
