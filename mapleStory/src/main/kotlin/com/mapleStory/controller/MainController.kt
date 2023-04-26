package com.mapleStory.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RestController
import retrofit2.Retrofit

@RestController
class MainController(
    private val retrofit: Retrofit) {



    fun test(){

    }

}