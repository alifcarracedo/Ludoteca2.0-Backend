package com.ccsw.ludoteca_2_backend.loan;

import com.ccsw.ludoteca_2_backend.client.ClientService;
import com.ccsw.ludoteca_2_backend.common.criteria.SearchCriteria;
import com.ccsw.ludoteca_2_backend.product.ProductService;
import com.ccsw.ludoteca_2_backend.loan.model.Loan;
import com.ccsw.ludoteca_2_backend.loan.model.LoanDto;
import com.ccsw.ludoteca_2_backend.loan.model.LoanSearchDto;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ccsw
 *
 */
@Service
@Transactional
public class LoanServiceImpl implements LoanService {

    @Autowired
    LoanRepository loanRepository;

    @Autowired
    ProductService gameService;

    @Autowired
    ClientService clientService;

    @Override
    public Loan find(Long id) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Loan get(Long id) {

        return this.loanRepository.findById(id).orElse(null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Page<Loan> findPage(LoanSearchDto dto) {

        LoanSpecification game = new LoanSpecification(new SearchCriteria("game.id", ":", dto.getIdGame()));
        LoanSpecification client = new LoanSpecification(new SearchCriteria("client.id", ":", dto.getIdClient()));
        LoanSpecification start = new LoanSpecification(new SearchCriteria("startDate", "<=", dto.getDate()));
        LoanSpecification end = new LoanSpecification(new SearchCriteria("endDate", ">=", dto.getDate()));

        Specification<Loan> spec = Specification.where(game).and(client).and(start).and(end);

        return this.loanRepository.findAll(spec, dto.getPageable().getPageable());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Long id, LoanDto dto) {

        //    validateDates(dto);
        //    validateGameAvailable(id, dto);
        //    validateClientLimit(id, dto);

        Loan loan;

        if (id == null) {
            loan = new Loan();
        } else {
            loan = this.loanRepository.findById(id).orElse(null);
        }

        BeanUtils.copyProperties(dto, loan, "id", "game", "client");

        loan.setGame(gameService.get(dto.getGame().getId()));
        loan.setClient(clientService.get(dto.getClient().getId()));

        this.loanRepository.save(loan);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Long id) throws Exception {

        if (this.get(id) == null) {
            throw new Exception("Not exists");
        }

        this.loanRepository.deleteById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Loan> findAll() {

        return (List<Loan>) this.loanRepository.findAll();
    }
}