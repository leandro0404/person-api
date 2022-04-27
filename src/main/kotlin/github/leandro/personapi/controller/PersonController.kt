package github.leandro.personapi.controller

import github.leandro.personapi.core.dto.CreatePersonRequest
import github.leandro.personapi.core.entity.IndividualPerson
import github.leandro.personapi.core.usecase.CreatePersonUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/person")
class PersonController(private val createPersonUseCase: CreatePersonUseCase) {

    @PostMapping
    fun post(@RequestBody request: CreatePersonRequest) {
        createPersonUseCase.execute(request)
    }
}