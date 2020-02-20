package br.com.fiap.kotlinwebflux

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface PessoaService {

    fun save(pessoaDTO: PessoaDTO): Mono<PessoaDTO>
    fun findAll(): Flux<PessoaDTO>
}