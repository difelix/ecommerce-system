package com.difelix.ecommercesystem.resources

import com.difelix.ecommercesystem.resources.dtos.CustomerRequestDTO
import com.difelix.ecommercesystem.resources.dtos.CustomerResponseDTO
import com.difelix.ecommercesystem.resources.mappers.toCustomer
import com.difelix.ecommercesystem.resources.mappers.toCustomerResponse
import com.difelix.ecommercesystem.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer")
class CustomerController(
   private val customerService: CustomerService
) {

   @PostMapping
   @ResponseBody
   @ResponseStatus(HttpStatus.CREATED)
   fun save(@RequestBody customerRequest: CustomerRequestDTO) : CustomerResponseDTO {
      val customerSaved = customerService.save(customerRequest.toCustomer())
      return customerSaved.toCustomerResponse()
   }

}