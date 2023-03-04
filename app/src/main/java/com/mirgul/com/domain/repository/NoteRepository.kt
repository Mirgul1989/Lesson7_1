package com.mirgul.com.domain.repository


import com.mirgul.com.domain.model.Note
import com.mirgul.com.domain.utils.Resource
import kotlinx.coroutines.flow.Flow


interface NoteRepository {

    fun addNote(note: Note):Flow<Resource<Unit>>

    fun editNote(note: Note):Flow<Resource<Unit>>

    fun getAllNotes() : Flow<Resource<List<Note>>>

    fun removeNote(note: Note):Flow<Resource<Unit>>
}