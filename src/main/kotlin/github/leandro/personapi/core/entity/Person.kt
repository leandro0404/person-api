package github.leandro.personapi.core.entity

import github.leandro.personapi.core.entity.enum.PersonType

abstract class Person(val type: PersonType) {

    val id: Long? = null
}