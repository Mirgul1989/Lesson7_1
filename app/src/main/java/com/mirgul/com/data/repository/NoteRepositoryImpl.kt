package com.mirgul.com.data.repository

import com.mirgul.com.data.local.NoteDao
import com.mirgul.com.data.mapping.toNote
import com.mirgul.com.data.mapping.toNoteEntity
import com.mirgul.com.domain.model.Note
import com.mirgul.com.domain.repository.NoteRepository
import com.mirgul.com.data.model.NoteEntity

class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository {
    override fun createNote(note: Note) {
      noteDao.createNote(note.toNoteEntity())
    }

    override fun editNote(note: Note) {
            noteDao.createNote(note.toNoteEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNote(note.toNoteEntity())
    }

    override fun getNotes(): List<Note> {
      return  noteDao.getNotes().map {
          it.toNote()
      }
    }
}