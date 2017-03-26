/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.question10;

import com.bo.DepartmentBo;
import com.model.Department;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author AhmetALBAYRAK
 */
public class App {
    public static void main(String[] args) {
        
        ApplicationContext appContext =
    	  new ClassPathXmlApplicationContext("config/BeanLocations.xml");
        
        
        
        DepartmentBo depBo = (DepartmentBo)appContext.getBean("departmentBo");
        
        Department dep = new Department();
        dep.setName("DDD");
        dep.setDescription("DDDD");

         
        depBo.save(dep);
//depDao.save(dep);
    
    }
        
        
    
    
}
