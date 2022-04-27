package github.leandro.personapi.core.adapter.impl

import github.leandro.personapi.core.adapter.PersonAdapter
import github.leandro.personapi.core.dto.CreatePersonRequest
import github.leandro.personapi.core.entity.CorporatePerson
import github.leandro.personapi.core.entity.IndividualPerson
import github.leandro.personapi.core.entity.Person
import github.leandro.personapi.core.entity.enum.PersonType
import org.springframework.stereotype.Component

@Component
class PersonAdapterImpl : PersonAdapter {

    override fun toPerson(request: CreatePersonRequest): Person {
        return when (request.type) {
            PersonType.INDIVIDUAL -> toIndividual(request)
            PersonType.CORPORATE -> toCorporate(request)
            else -> toIndividual(request)
        }
    }

    override fun toPerson(request: Person): github.leandro.personapi.core.repository.model.Person {

        return when (request.type) {
            PersonType.INDIVIDUAL -> toIndividual(request as IndividualPerson)
            PersonType.CORPORATE -> toCorporate(request as CorporatePerson)
            else -> toIndividual(request as IndividualPerson)
        }

    }

    private fun toIndividual(request: CreatePersonRequest): Person {
        return IndividualPerson()
    }

    private fun toCorporate(request: CreatePersonRequest): Person {
        val person = CorporatePerson()
        person.corporateName = request.corporateName
        return person
    }

    private fun toIndividual(request: IndividualPerson): github.leandro.personapi.core.repository.model.Person {
        val person = github.leandro.personapi.core.repository.model.Person()
        person.id = request.id

        return person
    }

    private fun toCorporate(request: CorporatePerson): github.leandro.personapi.core.repository.model.Person {
        val person = github.leandro.personapi.core.repository.model.Person()
        person.id = request.id
        person.name = request.corporateName
        person.type?.id = request.type.id
        return person
    }
}