package open.tresorier.services

import open.tresorier.dependenciesinjection.ITest
import open.tresorier.exception.SuspendedUserException
import open.tresorier.model.Person
import open.tresorier.utils.Time
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BillingServiceTest : ITest {

    @Test
    fun testUserIsSuspendedIfTheTrialPeriodIsDone() {
        Assertions.assertThrows(SuspendedUserException::class.java) {
            val person = Person("a","a","a","a", null, creationDate = Time.twoMonthAgo())
            //Assertions.assertTrue(Time.isMoreThanAMonthAgo(person.creationDate))
            BillingService.checkIfUserSubscriptionIsActive(person)
        }
    }

    @Test
    fun testUserIsNotSuspendedDuringTheTrialPeriod() {
        val person = Person("a","a","a","a", null, creationDate = Time.aWeekAgo())
        //Assertions.assertTrue(Time.isMoreThanAMonthAgo(person.creationDate))
        // no exception is thrown
        BillingService.checkIfUserSubscriptionIsActive(person)
    }
}