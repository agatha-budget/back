/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables.daos;


import java.util.List;

import open.tresorier.generated.jooq.main.tables.Operation;
import open.tresorier.generated.jooq.main.tables.records.OperationRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OperationDao extends DAOImpl<OperationRecord, open.tresorier.generated.jooq.main.tables.pojos.Operation, String> {

    /**
     * Create a new OperationDao without any configuration
     */
    public OperationDao() {
        super(Operation.OPERATION, open.tresorier.generated.jooq.main.tables.pojos.Operation.class);
    }

    /**
     * Create a new OperationDao with an attached configuration
     */
    public OperationDao(Configuration configuration) {
        super(Operation.OPERATION, open.tresorier.generated.jooq.main.tables.pojos.Operation.class, configuration);
    }

    @Override
    public String getId(open.tresorier.generated.jooq.main.tables.pojos.Operation object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchRangeOfId(String lowerInclusive, String upperInclusive) {
        return fetchRange(Operation.OPERATION.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchById(String... values) {
        return fetch(Operation.OPERATION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public open.tresorier.generated.jooq.main.tables.pojos.Operation fetchOneById(String value) {
        return fetchOne(Operation.OPERATION.ID, value);
    }

    /**
     * Fetch records that have <code>account_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchRangeOfAccountId(String lowerInclusive, String upperInclusive) {
        return fetchRange(Operation.OPERATION.ACCOUNT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>account_id IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchByAccountId(String... values) {
        return fetch(Operation.OPERATION.ACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>month BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchRangeOfMonth(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Operation.OPERATION.MONTH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>month IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchByMonth(Integer... values) {
        return fetch(Operation.OPERATION.MONTH, values);
    }

    /**
     * Fetch records that have <code>day BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchRangeOfDay(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Operation.OPERATION.DAY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>day IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchByDay(Integer... values) {
        return fetch(Operation.OPERATION.DAY, values);
    }

    /**
     * Fetch records that have <code>category_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchRangeOfCategoryId(String lowerInclusive, String upperInclusive) {
        return fetchRange(Operation.OPERATION.CATEGORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>category_id IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchByCategoryId(String... values) {
        return fetch(Operation.OPERATION.CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>memo BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchRangeOfMemo(String lowerInclusive, String upperInclusive) {
        return fetchRange(Operation.OPERATION.MEMO, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>memo IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchByMemo(String... values) {
        return fetch(Operation.OPERATION.MEMO, values);
    }

    /**
     * Fetch records that have <code>amount BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchRangeOfAmount(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Operation.OPERATION.AMOUNT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>amount IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchByAmount(Integer... values) {
        return fetch(Operation.OPERATION.AMOUNT, values);
    }

    /**
     * Fetch records that have <code>order_in_day BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchRangeOfOrderInDay(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Operation.OPERATION.ORDER_IN_DAY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>order_in_day IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchByOrderInDay(Long... values) {
        return fetch(Operation.OPERATION.ORDER_IN_DAY, values);
    }

    /**
     * Fetch records that have <code>pending BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchRangeOfPending(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Operation.OPERATION.PENDING, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>pending IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchByPending(Boolean... values) {
        return fetch(Operation.OPERATION.PENDING, values);
    }

    /**
     * Fetch records that have <code>locked BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchRangeOfLocked(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Operation.OPERATION.LOCKED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>locked IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchByLocked(Boolean... values) {
        return fetch(Operation.OPERATION.LOCKED, values);
    }

    /**
<<<<<<< HEAD
     * Fetch records that have <code>import_identifier BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchRangeOfImportIdentifier(String lowerInclusive, String upperInclusive) {
        return fetchRange(Operation.OPERATION.IMPORT_IDENTIFIER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>import_identifier IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchByImportIdentifier(String... values) {
        return fetch(Operation.OPERATION.IMPORT_IDENTIFIER, values);
    }

    /**
     * Fetch a unique record that has <code>import_identifier = value</code>
     */
    public open.tresorier.generated.jooq.main.tables.pojos.Operation fetchOneByImportIdentifier(String value) {
        return fetchOne(Operation.OPERATION.IMPORT_IDENTIFIER, value);
=======
     * Fetch records that have <code>mother_operation_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchRangeOfMotherOperationId(String lowerInclusive, String upperInclusive) {
        return fetchRange(Operation.OPERATION.MOTHER_OPERATION_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>mother_operation_id IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.Operation> fetchByMotherOperationId(String... values) {
        return fetch(Operation.OPERATION.MOTHER_OPERATION_ID, values);
>>>>>>> multipleCategories
    }
}
