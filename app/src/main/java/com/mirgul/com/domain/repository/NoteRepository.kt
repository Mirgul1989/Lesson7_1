package com.mirgul.com.domain.repository

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.mirgul.com.data.model.NoteEntity
import com.mirgul.com.domain.model.Note

interface NoteRepository {
    fun createNote(noteEntity: Note)

    fun editNote(noteEntity: Note)

    fun deleteNote(noteEntity: Note)

    fun getNotes(): List<Note>
}