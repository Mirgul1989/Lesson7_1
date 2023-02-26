package com.mirgul.com.domain.usecases

import com.mirgul.com.domain.model.Note
import com.mirgul.com.domain.repository.NoteRepository

class CreateNoteUseCase (
    private val noteRepository: NoteRepository
        ){
    fun createNote(note: Note) = noteRepository.createNote(note)
}