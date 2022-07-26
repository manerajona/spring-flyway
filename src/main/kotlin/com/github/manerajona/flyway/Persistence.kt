package com.github.manerajona.flyway

import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime
import javax.persistence.*

interface TraineeRepository : JpaRepository<Trainee, Long>

@Entity
@Table(name = "trainee")
class Trainee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trainee_id")
    val id: Long? = null

    @Column(nullable = false)
    val name: String? = null

    @Column(nullable = false)
    var startDate: LocalDateTime? = null

    var endDate: LocalDateTime? = null

    @ManyToMany
    @JoinTable(
        name = "trainee_skill",
        joinColumns = [JoinColumn(name = "trainee_id")],
        inverseJoinColumns = [JoinColumn(name = "skill_id")]
    )
    var skills: Set<Skill> = HashSet()
}

@Entity
@Table(name = "skill")
class Skill {

    @Id
    @Column(name = "skill_id")
    val id: Long? = null

    @Column(nullable = false)
    val name: String? = null

    val description: String? = null
}
