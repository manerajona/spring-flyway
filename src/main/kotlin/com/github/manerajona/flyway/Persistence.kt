package com.github.manerajona.flyway

import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime
import javax.persistence.*

interface TraineeRepository : JpaRepository<Trainee, Long>

@Entity
@Table(name = "trainee")
open class Trainee {

    @get:Id
    @get:GeneratedValue
    @get:Column(name = "trainee_id")
    open var id: Long? = null

    @get:Column(nullable = false)
    open var name: String? = null

    @get:Column(nullable = false)
    open var startDate: LocalDateTime? = null

    open var endDate: LocalDateTime? = null

    @get:ManyToMany
    @get:JoinTable(
        name = "trainee_skill",
        joinColumns = [JoinColumn(name = "trainee_id")],
        inverseJoinColumns = [JoinColumn(name = "skill_id")]
    )
    open var skills: Set<Skill> = HashSet()

    override fun equals(other: Any?): Boolean = when {
        this === other -> true
        other == null || javaClass != other.javaClass -> false
        else -> {
            val that = other as Trainee
            if (id != that.id) false
            true
        }
    }


    override fun hashCode(): Int = when {
        id != null -> id.hashCode()
        else -> 0
    }
}

@Entity
@Table(name = "skill")
open class Skill {

    @get:Id
    @get:Column(name = "skill_id")
    open var id: Long? = null

    @get:Column(nullable = false)
    open var name: String? = null

    open var description: String? = null

    override fun equals(other: Any?): Boolean = when {
        this === other -> true
        other == null || javaClass != other.javaClass -> false
        else -> {
            val that = other as Skill
            if (id != that.id) false
            true
        }
    }


    override fun hashCode(): Int = when {
        id != null -> id.hashCode()
        else -> 0
    }
}
