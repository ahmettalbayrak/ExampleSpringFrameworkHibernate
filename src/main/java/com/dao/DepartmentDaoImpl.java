/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Department;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author AhmetALBAYRAK
 */
public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao{

    @Override
    public void save(Department department) {
        getHibernateTemplate().save(department);
    }

    @Override
    public void update(Department department) {
        getHibernateTemplate().update(department);
    }

    @Override
    public void delete(Department department) {
        getHibernateTemplate().delete(department);
    }

    @Override
    public Department findByDepartmentId(String departmentId) {
        List list = getHibernateTemplate().find("from Department where id=?",departmentId);
        return (Department)list.get(0);
    }
    
}
