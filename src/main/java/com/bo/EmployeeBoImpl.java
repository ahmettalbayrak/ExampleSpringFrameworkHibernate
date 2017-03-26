/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bo;

import com.dao.EmployeeDao;
import com.model.Employee;

/**
 *
 * @author AhmetALBAYRAK
 */
public class EmployeeBoImpl implements EmployeeBo{
    
    EmployeeDao employeeDao;
    public void setEmployeeDao(EmployeeDao employeeDao){
        this.employeeDao=employeeDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public void update(Employee employee) {
       employeeDao.update(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeDao.delete(employee);
    }

    @Override
    public Employee findByEmployeId(String EmployeeId) {
        return employeeDao.findByEmployeId(EmployeeId);
    }
    
}
