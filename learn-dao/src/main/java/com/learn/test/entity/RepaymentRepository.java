package com.learn.test.entity;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author geweijian
 * @data 2017-10-24
 */
public interface RepaymentRepository extends CrudRepository<RepayPlanHistoryEntity, Integer> {

    List<RepayPlanHistoryEntity> findByLoanId(String loanId);
}
