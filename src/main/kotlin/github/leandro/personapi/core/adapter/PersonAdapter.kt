package github.leandro.personapi.core.adapter

import github.leandro.personapi.core.dto.CreatePersonRequest
import github.leandro.personapi.core.entity.Person

interface PersonAdapter {
    fun toPerson(request: CreatePersonRequest): Person

    fun toPerson(request: Person): github.leandro.personapi.core.repository.model.Person

}