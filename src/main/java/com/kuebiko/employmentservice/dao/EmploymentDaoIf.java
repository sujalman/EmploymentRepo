package com.kuebiko.employmentservice.dao;

import com.kuebiko.employmentservice.models.Employment;

public interface EmploymentDaoIf {

    Employment save(Employment employment);
    Employment find(Long id);
    void delete(Long id);
}
