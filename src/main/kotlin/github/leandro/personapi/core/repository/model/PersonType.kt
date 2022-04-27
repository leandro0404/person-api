package github.leandro.personapi.core.repository.model

import javax.persistence.*

@Entity
@Table(name = "type")
class PersonType {


    @Id
    var id: Long? = null

    @Column(unique = true)
    private var name: String? = null
}