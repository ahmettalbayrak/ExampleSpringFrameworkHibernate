/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Department;

/**
 *
 * @author AhmetALBAYRAK
 */
public interface DepartmentDao {
    void save(Department department);
    void update(Department department);
    void delete(Department department);
    Department findByDepartmentId(String DepartmentId); 
}
