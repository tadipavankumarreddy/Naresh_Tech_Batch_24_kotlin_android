package com.nareshtech.humanroomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "human")
data class Human(

    @PrimaryKey(autoGenerate = true)
    val human_id:Int,

    @ColumnInfo(name = "humanName")
    val human_name:String,
    val human_age:Int
)
