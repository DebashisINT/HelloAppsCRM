package com.helloappscrmfsm.features.dashboard.presentation.api.dayStartEnd

import com.helloappscrmfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.helloappscrmfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}