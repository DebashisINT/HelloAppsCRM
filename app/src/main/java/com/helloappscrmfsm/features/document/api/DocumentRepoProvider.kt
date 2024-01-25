package com.helloappscrmfsm.features.document.api

import com.helloappscrmfsm.features.dymanicSection.api.DynamicApi
import com.helloappscrmfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}