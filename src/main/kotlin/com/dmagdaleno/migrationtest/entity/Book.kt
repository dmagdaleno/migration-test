package com.dmagdaleno.migrationtest.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.persistence.Table
import javax.validation.constraints.Size

@Entity
@Table(name = "books")
data class Book (
        @Id
        @SequenceGenerator(name = "books_seq", sequenceName = "books_seq", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "books_seq")
        val id: Long,

        @Size(min = 1, max = 100)
        val name: String,

        @Size(min = 1, max = 500)
        val synopsis: String,

        @Column(name = "author_name")
        val authorName: String
)