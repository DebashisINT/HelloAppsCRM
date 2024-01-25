package com.helloappscrmfsm.features.survey.api

import com.helloappscrmfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.helloappscrmfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}