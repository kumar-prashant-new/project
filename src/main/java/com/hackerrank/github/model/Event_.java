package com.hackerrank.github.model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Event.class)
public abstract class Event_ {

	public static volatile SingularAttribute<Event, Actor> actor;
	public static volatile SingularAttribute<Event, Timestamp> createdAt;
	public static volatile SingularAttribute<Event, Repo> repo;
	public static volatile SingularAttribute<Event, Long> id;
	public static volatile SingularAttribute<Event, String> type;

	public static final String ACTOR = "actor";
	public static final String CREATED_AT = "createdAt";
	public static final String REPO = "repo";
	public static final String ID = "id";
	public static final String TYPE = "type";

}

