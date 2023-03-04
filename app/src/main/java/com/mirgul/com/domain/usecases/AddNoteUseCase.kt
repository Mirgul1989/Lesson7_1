package com.mirgul.com.domain.usecases

import com.mirgul.com.domain.model.Note
import com.mirgul.com.domain.repository.NoteRepository
import javax.inject.Inject

class AddNoteUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    fun addNote(note: Note) = noteRepository.addNote(note)
}