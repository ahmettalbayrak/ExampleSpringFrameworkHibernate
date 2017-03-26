/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Meetings;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author AhmetALBAYRAK
 */
public class MeetingsDaoImpl extends HibernateDaoSupport implements MeetingsDao{

    @Override
    public void save(Meetings meetings) {
        getHibernateTemplate().save(meetings);
    }

    @Override
    public void update(Meetings meetings) {
        getHibernateTemplate().update(meetings);
    }

    @Override
    public void delete(Meetings meetings) {
        getHibernateTemplate().delete(meetings);
    }

    @Override
    public Meetings findByMeetingsId(String meetingsId) {
        List list = getHibernateTemplate().find("from Meetings where id=?",meetingsId);
        return (Meetings)list.get(0);
    }
    
}
