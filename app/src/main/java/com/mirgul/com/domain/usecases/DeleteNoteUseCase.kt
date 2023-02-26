package com.mirgul.com.domain.usecases

import com.mirgul.com.domain.model.Note
import com.mirgul.com.domain.repository.NoteRepository

class DeleteNoteUseCase (
    private val noteRepository: NoteRepository
        ){
    fun deleteNote(note: Note) = noteRepository.deleteNote(note)
}