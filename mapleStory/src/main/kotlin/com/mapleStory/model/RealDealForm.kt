package com.mapleStory.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name="item")
data class RealDealForm(

    @field:Element(name = "id")
    var id : String = "",
    @field:Element(name = "캐릭터이름")
    var characterName :      String = "",
    @field:Element(name = "월드이름")
    var worldName :  String = "",

)
