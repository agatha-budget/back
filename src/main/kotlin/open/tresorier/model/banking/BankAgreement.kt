package open.tresorier.model.banking

import open.tresorier.model.DbObject
import open.tresorier.utils.Time

open class BankAgreement (
    var budgetId: String,
    var bankId: String,
    val timestamp: Long = Time.now(),
    var nordigenRequisitionId: String? = null,
    var archived: Boolean = false,
    id: String? = null,
    deleted: Boolean? = null
) : DbObject(id, deleted){

    override fun toString(): String {
        return "id: $id, budgetId: $budgetId, timestamp: $timestamp, nordigenRequisitionId: $nordigenRequisitionId, bankId: $bankId"
    }
}

