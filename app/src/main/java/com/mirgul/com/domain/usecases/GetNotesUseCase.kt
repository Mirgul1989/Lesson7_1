package com.mirgul.com.domain.usecases

import com.mirgul.com.domain.repository.NoteRepository

class GetNotesUseCase (
    private val noteRepository:NoteRepository
        )
{
    fun getNotes() = noteRepository.getNotes()
}

