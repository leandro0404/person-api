package github.leandro.personapi.core.repository.model

import javax.persistence.*


@Entity
@Table(name = "person")
class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null

    @Column(unique = true)
    var name: String? = null

    @ManyToOne
    @JoinColumn(name = "type", nullable = false, updatable = false)
    var type: PersonType? = null
}
