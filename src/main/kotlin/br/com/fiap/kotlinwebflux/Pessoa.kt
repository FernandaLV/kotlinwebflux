package br.com.fiap.kotlinwebflux

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Pessoa(
        @Id
        var id: String? = null,
        val nome: String
)