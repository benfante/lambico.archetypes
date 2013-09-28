#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * Copyright (C) 2013 Lambico Team <info@lambico.org>
 *
 * This file is part of Lambico WS Archetype Template - Core.
 */
package ${package}.core.dao;

import java.util.Date;
import java.util.List;
import ${groupId}.dao.generic.Dao;
import ${groupId}.dao.generic.GenericDao;
import ${package}.core.po.Person;

/**
 * The DAO interface for the Person entity.
 *
 * @author <a href="mailto:lucio@benfante.com">Lucio Benfante</a>
 * @version ${symbol_dollar}Revision: ae7fb2fab619 ${symbol_dollar}
 */
@Dao(entity = Person.class)
public interface PersonDao extends GenericDao<Person, Long> {

    List<Person> findByLastName(String lastName);

    List<Person> findByFirstNameAndLastName(String firstName, String lastName);

    List<Person> findByBirthDate(Date birthDate);

    List<Person> findByFirstName(String firstName);
}