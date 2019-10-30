package com.dmagdaleno.migrationtest.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.Size

@Entity
@Table(name = "books")
data class Book (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Size(min = 1, max = 100)
        val name: String,

        @Size(min = 1, max = 500)
        val synopsis: String
)