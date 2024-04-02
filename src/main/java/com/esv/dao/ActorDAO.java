package com.esv.dao;

import com.esv.domain.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends GenericDAO <Actor>{
    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
