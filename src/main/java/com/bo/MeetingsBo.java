/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bo;

import com.model.Meetings;

/**
 *
 * @author AhmetALBAYRAK
 */
public interface MeetingsBo {
    void save(Meetings meetings);
    void update(Meetings meetings);
    void delete(Meetings meetings);
    Meetings findByMeetingsId(String MeetingsId);  
}
