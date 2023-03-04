package com.mirgul.com.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NoteEntity(
    @PrimaryKey
    val id : Int,
    val title : String,
    val description : String,
)