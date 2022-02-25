package com.kuebiko.employmentservice.service;

import com.kuebiko.employmentservice.dao.EmploymentDao;
import com.kuebiko.employmentservice.models.Employment;
import com.kuebiko.employmentservice.utility.EmploymentValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmploymentService implements EmploymentServiceIf {

    @Autowired
    EmploymentDao employmentDao;

    @Override
    public Employment save(Employment payload) throws Exception {
        EmploymentValidation.validateEmployment(payload);
        return employmentDao.save(payload);
    }

    @Override
    public Employment find(Long id) {
        return employmentDao.find(id);
    }

    @Override
    public void delete(Long id) {

    }
}
