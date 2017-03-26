/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bo;

import com.dao.DepartmentDao;
import com.model.Department;

/**
 *
 * @author AhmetALBAYRAK
 */
public class DepartmentBoImpl implements DepartmentBo{

    DepartmentDao departmentDao;

    public DepartmentDao getDepartmentDao() {
        return departmentDao;
    }

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }
    
    
    
    public void setDepartmenDao(DepartmentDao departmentDao){
        this.departmentDao=departmentDao;
    }
    @Override
    public void save(Department department) {
        departmentDao.save(department);
    }

    @Override
    public void update(Department department) {
        departmentDao.update(department);
    }

    @Override
    public void delete(Department department) {
        departmentDao.delete(department);
    }

    @Override
    public Department findByDepartmentId(String DepartmentId) {
        return departmentDao.findByDepartmentId(DepartmentId);
    }
    
}
