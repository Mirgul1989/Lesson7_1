package com.mirgul.com.domain.usecases

import com.mirgul.com.domain.model.Note
import com.mirgul.com.domain.repository.NoteRepository
import javax.inject.Inject

class RemoveNoteUseCase@Inject constructor(private val noteRepository: NoteRepository) {
    fun removeNote (note: Note) = noteRepository.removeNote(note)
}