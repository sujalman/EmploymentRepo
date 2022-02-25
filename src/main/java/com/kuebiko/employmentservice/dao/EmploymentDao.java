package com.kuebiko.employmentservice.dao;

import com.kuebiko.employmentservice.entity.EmploymentEntity;
import com.kuebiko.employmentservice.models.Employment;
import com.kuebiko.employmentservice.repo.EmploymentRepo;
import com.kuebiko.employmentservice.utility.EmploymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmploymentDao implements EmploymentDaoIf{

    @Autowired
    EmploymentRepo employmentRepo;

    @Override
    public Employment save(Employment employment) {

        EmploymentEntity toSave = new EmploymentEntity();
        EmploymentMapper.map(employment,toSave);

        EmploymentEntity savedEntity = employmentRepo.save(toSave);

        Employment response = new Employment();
        EmploymentMapper.map(savedEntity,response);

        return response;
    }

    @Override
    public Employment find(Long id) {

        EmploymentEntity data = employmentRepo.getById(id);
        Employment response = new Employment();
        EmploymentMapper.map(data,response);

        return response;
    }

    @Override
    public void delete(Long id) {

    }
}
