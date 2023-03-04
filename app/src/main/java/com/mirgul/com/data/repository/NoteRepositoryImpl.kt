package com.mirgul.com.data.repository

import com.mirgul.com.data.local.NoteDao
import com.mirgul.com.data.mapping.toNote
import com.mirgul.com.data.mapping.toNoteEntity
import com.mirgul.com.domain.model.Note
import com.mirgul.com.domain.repository.NoteRepository
import com.mirgul.com.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(private val noteDao: NoteDao) : NoteRepository {

    override fun addNote(note: Note):Flow<Resource<Unit>> = flow {
        emit(Resource.Loading())
        try {
            val data = noteDao.addNote(note.toNoteEntity())
            emit(Resource.Success(data))

        }catch (ioException: Exception){

            emit(Resource.Error(ioException.localizedMessage?:"Не известная ошибка"))
        }

    }.flowOn(Dispatchers.IO)

    override fun getAllNotes(): Flow<Resource<List<Note>>> = flow{

        emit(Resource.Loading())
        try {
            val data = noteDao.getAllNotes().map { it.toNote() }
            emit(Resource.Success(data))

        }catch (ioException: Exception){

            emit(Resource.Error(ioException.localizedMessage?:"Не известная ошибка"))
        }



    }.flowOn(Dispatchers.IO)

    override fun editNote(note: Note): Flow<Resource<Unit>> = flow {

        emit(Resource.Loading())
        try {
            val data = noteDao.editNote(note.toNoteEntity())
            emit(Resource.Success(data))

        }catch (ioException: Exception){

            emit(Resource.Error(ioException.localizedMessage?:"Не известная ошибка"))
        }

    }

    override fun removeNote(note: Note): Flow<Resource<Unit>> = flow {

        emit(Resource.Loading())
        try {
            val data = noteDao.removeNote(note.toNoteEntity())
            emit(Resource.Success(data))

        }catch (ioException: Exception){

            emit(Resource.Error(ioException.localizedMessage?:"Не известная ошибка"))
        }

    }.flowOn(Dispatchers.IO)
}