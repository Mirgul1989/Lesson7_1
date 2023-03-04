package com.mirgul.com.domain.usecases

import com.mirgul.com.domain.repository.NoteRepository
import javax.inject.Inject


class GetAllNotesUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    fun getAllNotes() = noteRepository.getAllNotes()
}

