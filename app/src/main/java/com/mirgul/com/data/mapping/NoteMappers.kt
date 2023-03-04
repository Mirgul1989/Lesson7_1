package com.mirgul.com.data.mapping

import com.mirgul.com.data.model.NoteEntity
import com.mirgul.com.domain.model.Note


fun NoteEntity.toNote() = Note(id, title, description)

fun Note.toNoteEntity(): NoteEntity = NoteEntity(id, title, description)
