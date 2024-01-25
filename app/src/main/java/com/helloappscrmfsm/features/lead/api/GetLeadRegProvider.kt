package com.helloappscrmfsm.features.lead.api

import com.helloappscrmfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.helloappscrmfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}