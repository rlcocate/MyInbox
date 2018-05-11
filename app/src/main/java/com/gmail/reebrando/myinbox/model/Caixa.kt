package com.gmail.reebrando.myinbox.Model

import java.util.*

/**
 * Created by Rodrigo on 05/05/2018.
 */
data class Caixa
(
    // Identificador daquela carta a ser retirada
    var id: Number,
    var dataChegada: Date,
    var quantidade: Number,
    var retirada: Boolean,
    var dataRetirada: Date,
    var observacao: String
)
