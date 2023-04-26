package com.mapleStory

import com.mapleStory.service.BasicInterface
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@SpringBootTest
class MapleStoryApplicationTests  @Autowired constructor( private val retrofit: Retrofit) {

	@Test
	fun contextLoads() {
		val response = retrofit.create(BasicInterface::class.java)
				.getRestDeInfo(
					count = 100,
					date = "2023-04-20",
					cursor = ""
					)
				.execute()
				.body()





		println("response?.body?.items;${retrofit.baseUrl()}")
		println("response?.body?.items;${response?.count}")
		println("response?.body?.items;${response?.body}")
	}

	@Test
	fun con(){
		val retrofit = Retrofit.Builder()
			.baseUrl("https://public.api.nexon.com/openapi/maplestory/v1/")
			.addConverterFactory(GsonConverterFactory.create())
			.build()
		println(retrofit)
	}
}
