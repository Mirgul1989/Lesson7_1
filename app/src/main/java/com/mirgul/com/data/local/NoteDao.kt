package com.mirgul.com.data.local

import androidx.room.*
import com.mirgul.com.data.model.NoteEntity

@Dao
interface NoteDao {
    @Insert
    fun createNote(noteEntity: NoteEntity)

    @Update
    fun editNote(noteEntity: NoteEntity)

    @Delete
    fun deleteNote(noteEntity: NoteEntity)

    @Query("SELECT*FROM notes")
    fun getNotes(): List<NoteEntity>
}