package com.mirgul.com.domain.usecases

import com.mirgul.com.domain.model.Note
import com.mirgul.com.domain.repository.NoteRepository

class EditNoteUseCase (
    private val noteRepository: NoteRepository
        ){
    fun editNote(note: Note) = noteRepository.editNote(note)
}