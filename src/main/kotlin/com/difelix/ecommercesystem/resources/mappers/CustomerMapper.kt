package com.difelix.ecommercesystem.resources.mappers

import com.difelix.ecommercesystem.domain.Customer
import com.difelix.ecommercesystem.resources.dtos.CustomerRequestDTO
import com.difelix.ecommercesystem.resources.dtos.CustomerResponseDTO

fun CustomerRequestDTO.toCustomer() = Customer(
   name = this.name,
   email = this.email,
   cpfOrCnpj = this.cpfOrCnpj
)

fun Customer.toCustomerResponse() = CustomerResponseDTO(
   id = this.id,
   name = this.name,
   email = this.email,
   cpfOrCnpj = this.cpfOrCnpj,
   type = this.type?.name
)