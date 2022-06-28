package open.tresorier.services

import open.tresorier.dao.IUserActivityDao
import open.tresorier.model.*
import open.tresorier.model.enum.ActionEnum


class UserActivityService(private val userActivityDao: IUserActivityDao) {

    fun create(user: Person, date: Long, action: ActionEnum): UserActivity {
        val userActivity = UserActivity(user.id, date, action)
        userActivityDao.insert(userActivity)
        return userActivity
    }

    fun update(userActivity: UserActivity, newAction: ActionEnum): UserActivity {
        userActivity.action = newAction
        return userActivityDao.update(userActivity)
    }

    fun getById(userId: String): List<UserActivity> {
        return userActivityDao.getByUserId(userId)
    }

    fun getByDate(date: Long): List<UserActivity> {
        return userActivityDao.getByDate(date)
    }

    fun getByAction(action: ActionEnum): List<UserActivity> {
        return userActivityDao.getByAction(action)
    }
}