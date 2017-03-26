/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Employee;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author AhmetALBAYRAK
 */
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao{

    @Override
    public void save(Employee employee) {
        getHibernateTemplate().save(employee);
    }

    @Override
    public void update(Employee employee) {
        getHibernateTemplate().update(employee);
    }

    @Override
    public void delete(Employee employee) {
        getHibernateTemplate().delete(employee);
    }

    @Override
    public Employee findByEmployeId(String employeeId) {
        List list = getHibernateTemplate().find("from Employee where id=?",employeeId);
        return (Employee)list.get(0);
    }
    
}
