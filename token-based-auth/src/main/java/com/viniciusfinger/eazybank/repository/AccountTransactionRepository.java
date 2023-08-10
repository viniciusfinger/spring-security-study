package com.viniciusfinger.eazybank.repository;

import com.viniciusfinger.eazybank.model.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Long> {

    List<AccountTransaction> findByCustomerIdOrderByTransactionDtDesc(Integer customerId);

}
