package br.com.fiap.kotlinwebflux

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties::class)
class KotlinwebfluxApplication

fun main(args: Array<String>) {
	runApplication<KotlinwebfluxApplication>(*args)
}
