package com.mapleStory.service


import com.mapleStory.entity.DataResponse
import retrofit2.*
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface BasicInterface {
    @GET("cube-use-results")
    fun getRestDeInfo(
        @Header("Authorization") authorization: String = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJYLUFwcC1SYXRlLUxpbWl0IjoiNTAwOjEwIiwiYWNjb3VudF9pZCI6IjUzNjk5NzYyMyIsImF1dGhfaWQiOiIyIiwiZXhwIjoxNjk4MDQ1Nzk3LCJpYXQiOjE2ODI0OTM3OTcsIm5iZiI6MTY4MjQ5Mzc5Nywic2VydmljZV9pZCI6IjQzMDAxMTM5NyIsInRva2VuX3R5cGUiOiJBY2Nlc3NUb2tlbiJ9.vSfcogBkAOfGu0g6rZk3FAnutSoRO3hZ1zsxcPAt4qU",
        @Query("count") count: Int,
        @Query("date") date: String,
        @Query("cursor") cursor: String? = null
    ): Call<DataResponse>
}