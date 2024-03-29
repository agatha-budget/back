/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables.daos;


import java.util.List;
import java.util.Optional;

import open.tresorier.generated.jooq.test.public_.tables.Budget;
import open.tresorier.generated.jooq.test.public_.tables.records.BudgetRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BudgetDao extends DAOImpl<BudgetRecord, open.tresorier.generated.jooq.test.public_.tables.pojos.Budget, String> {

    /**
     * Create a new BudgetDao without any configuration
     */
    public BudgetDao() {
        super(Budget.BUDGET, open.tresorier.generated.jooq.test.public_.tables.pojos.Budget.class);
    }

    /**
     * Create a new BudgetDao with an attached configuration
     */
    public BudgetDao(Configuration configuration) {
        super(Budget.BUDGET, open.tresorier.generated.jooq.test.public_.tables.pojos.Budget.class, configuration);
    }

    @Override
    public String getId(open.tresorier.generated.jooq.test.public_.tables.pojos.Budget object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.test.public_.tables.pojos.Budget> fetchRangeOfId(String lowerInclusive, String upperInclusive) {
        return fetchRange(Budget.BUDGET.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.test.public_.tables.pojos.Budget> fetchById(String... values) {
        return fetch(Budget.BUDGET.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public open.tresorier.generated.jooq.test.public_.tables.pojos.Budget fetchOneById(String value) {
        return fetchOne(Budget.BUDGET.ID, value);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public Optional<open.tresorier.generated.jooq.test.public_.tables.pojos.Budget> fetchOptionalById(String value) {
        return fetchOptional(Budget.BUDGET.ID, value);
    }

    /**
     * Fetch records that have <code>PERSON_ID BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.test.public_.tables.pojos.Budget> fetchRangeOfPersonId(String lowerInclusive, String upperInclusive) {
        return fetchRange(Budget.BUDGET.PERSON_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>PERSON_ID IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.test.public_.tables.pojos.Budget> fetchByPersonId(String... values) {
        return fetch(Budget.BUDGET.PERSON_ID, values);
    }

    /**
     * Fetch records that have <code>NAME BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.test.public_.tables.pojos.Budget> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Budget.BUDGET.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.test.public_.tables.pojos.Budget> fetchByName(String... values) {
        return fetch(Budget.BUDGET.NAME, values);
    }

    /**
     * Fetch records that have <code>DELETED BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.test.public_.tables.pojos.Budget> fetchRangeOfDeleted(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Budget.BUDGET.DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>DELETED IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.test.public_.tables.pojos.Budget> fetchByDeleted(Boolean... values) {
        return fetch(Budget.BUDGET.DELETED, values);
    }

    /**
     * Fetch records that have <code>PROFILE BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.test.public_.tables.pojos.Budget> fetchRangeOfProfile(String lowerInclusive, String upperInclusive) {
        return fetchRange(Budget.BUDGET.PROFILE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>PROFILE IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.test.public_.tables.pojos.Budget> fetchByProfile(String... values) {
        return fetch(Budget.BUDGET.PROFILE, values);
    }
}
