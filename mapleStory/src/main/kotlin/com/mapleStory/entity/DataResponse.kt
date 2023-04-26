package com.mapleStory.entity

import com.google.gson.annotations.SerializedName
import com.mapleStory.model.RealDealForm
import okhttp3.ResponseBody
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "response", strict = false)
class DataResponse(

    @SerializedName("headers")
    var header: Header? = null,
    @SerializedName("cube_histories")
    var body: List<RealDealForm> = mutableListOf(),
    @SerializedName("count")
    var count: String? =null
)
@Root(strict = false)
data class Header (
    @field:Element(name = "statusCode")
    @SerializedName("statusCode")
    var statusCode: Int = 0
)

@Root(strict = false)
data class Body(
    @field:ElementList(name = "items", entry = "item", required = false)
    var items: List<RealDealForm> = mutableListOf(),
    @field:Element(name = "numOfRows")
    var numOfRows: Int = 0,
    @field:Element(name = "pageNo")
    var pageNo: Int = 0,
    @field:Element(name = "totalCount")
    var totalCount: Int = 0
)