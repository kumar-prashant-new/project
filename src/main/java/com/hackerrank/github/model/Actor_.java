package com.hackerrank.github.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Actor.class)
public abstract class Actor_ {

	public static volatile SingularAttribute<Actor, Long> id;
	public static volatile SingularAttribute<Actor, String> avatar;
	public static volatile SingularAttribute<Actor, String> login;
	public static volatile ListAttribute<Actor, Event> events;

	public static final String ID = "id";
	public static final String AVATAR = "avatar";
	public static final String LOGIN = "login";
	public static final String EVENTS = "events";

}

