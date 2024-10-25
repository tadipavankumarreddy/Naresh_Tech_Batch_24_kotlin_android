package com.nareshtech.humanroomdatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface HumanDAO {

    @Insert
    fun insertData(human:Human):Unit

    // insert into human(name, age) values ("Pavan", 33);

    @Query("select * from human")
    fun getAllData():List<Human>

    @Update
    fun updateRow(human: Human)
}