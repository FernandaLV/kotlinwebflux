package br.com.fiap.kotlinwebflux

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("propriedade")
class ConfigProperties {
    var remoteFile: String? = null
}