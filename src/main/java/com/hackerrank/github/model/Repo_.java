package com.hackerrank.github.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Repo.class)
public abstract class Repo_ {

	public static volatile SingularAttribute<Repo, String> name;
	public static volatile SingularAttribute<Repo, Long> id;
	public static volatile SingularAttribute<Repo, String> url;

	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String URL = "url";

}

