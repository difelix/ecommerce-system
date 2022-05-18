package com.difelix.ecommercesystem.resources.dtos

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(value = JsonInclude.Include.NON_NULL)
data class CustomerResponseDTO(
   var id: Int? = null,

   @JsonProperty("nome")
   var name: String? = null,

   var email: String? = null,

   @JsonProperty("cpf_cnpj")
   var cpfOrCnpj: String? = null,

   @JsonProperty("tipo")
   var type: String? = null
)
