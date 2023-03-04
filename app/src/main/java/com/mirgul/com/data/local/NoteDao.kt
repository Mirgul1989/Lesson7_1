package com.mirgul.com.data.local

import androidx.room.*
import com.mirgul.com.data.model.NoteEntity


@Dao
interface NoteDao {
    @Insert
    suspend fun addNote(noteEntity: NoteEntity)

    @Query("SELECT * FROM notes ")
    suspend fun getAllNotes(): List<NoteEntity>

    @Update
    suspend fun editNote(noteEntity: NoteEntity)

    @Delete
    suspend fun removeNote(noteEntity: NoteEntity)
}