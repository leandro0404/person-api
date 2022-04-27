package github.leandro.personapi.core.usecase.impl

import github.leandro.personapi.core.adapter.PersonAdapter
import github.leandro.personapi.core.dto.CreatePersonRequest
import github.leandro.personapi.core.entity.Person
import github.leandro.personapi.core.repository.PersonRepository
import github.leandro.personapi.core.usecase.CreatePersonUseCase
import github.leandro.personapi.core.validator.PersonValidator
import org.springframework.stereotype.Component

@Component
class CreatePersonUseCaseImpl(
    private val validator: List<PersonValidator>,
    private val repository: PersonRepository,
    private val adapter: PersonAdapter
) : CreatePersonUseCase {

    override fun execute(request: CreatePersonRequest) {

        val domainPerson = adapter.toPerson(request)

        val valid = validator.first { x -> x.type == request.type }.valid(domainPerson);

        val  modelPerson = adapter.toPerson(domainPerson)

        repository.save(modelPerson)
    }
}