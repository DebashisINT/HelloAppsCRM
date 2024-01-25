package com.helloappscrmfsm.features.dymanicSection.api

import com.helloappscrmfsm.features.dailyPlan.api.PlanApi
import com.helloappscrmfsm.features.dailyPlan.api.PlanRepo

/**
 * Created by Saikat on 19-Aug-20.
 */
object DynamicRepoProvider {
    fun dynamicRepoProvider(): DynamicRepo {
        return DynamicRepo(DynamicApi.create())
    }

    fun dynamicRepoProviderMultipart(): DynamicRepo {
        return DynamicRepo(DynamicApi.createImage())
    }
}