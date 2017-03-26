/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bo;

import com.dao.MeetingsDao;
import com.model.Meetings;

/**
 *
 * @author AhmetALBAYRAK
 */
public class MeetingsBoImpl implements MeetingsBo{

    MeetingsDao meetingsDao;

    public MeetingsDao getMeetingsDao() {
        return meetingsDao;
    }

    public void setMeetingsDao(MeetingsDao meetingsDao) {
        this.meetingsDao = meetingsDao;
    }
    public void setMeetingsDepartmenDao(MeetingsDao meetingsDao){
        this.meetingsDao=meetingsDao;        
    }
    
    @Override
    public void save(Meetings meetings) {
        meetingsDao.save(meetings);
    }

    @Override
    public void update(Meetings meetings) {
        meetingsDao.update(meetings);
    }

    @Override
    public void delete(Meetings meetings) {
        meetingsDao.delete(meetings);
    }

    @Override
    public Meetings findByMeetingsId(String MeetingsId) {
        return meetingsDao.findByMeetingsId(MeetingsId);
    }
    
}
