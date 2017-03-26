/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Employee;

/**
 *
 * @author AhmetALBAYRAK
 */
public interface EmployeeDao {
    void save(Employee employee);
    void update(Employee employee);
    void delete(Employee employee);
    Employee findByEmployeId(String EmployeeId);  
}
