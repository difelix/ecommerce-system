package com.difelix.ecommercesystem.resources.dtos

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerRequestDTO(

   @JsonProperty("nome")
   var name: String? = null,

   var email: String? = null,

   @JsonProperty("cpf_cnpj")
   var cpfOrCnpj: String? = null,

   @JsonProperty("tipo")
   var type: String? = null

)
