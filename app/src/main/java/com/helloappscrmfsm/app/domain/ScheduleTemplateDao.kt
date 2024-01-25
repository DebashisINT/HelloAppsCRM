package com.helloappscrmfsm.app.domain

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.helloappscrmfsm.app.AppConstant

@Dao
interface ScheduleTemplateDao {


    @Insert
    fun insert(vararg obj: ScheduleTemplateEntity)

    @Query("select * from " + AppConstant.SCHEDULE_TEMPLATE)
    fun getAll(): List<ScheduleTemplateEntity>

    @Query("DELETE FROM " + AppConstant.SCHEDULE_TEMPLATE)
    fun deleteAll()
}