package com.difelix.ecommercesystem.service

import com.difelix.ecommercesystem.domain.Customer
import com.difelix.ecommercesystem.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
   private val customerRepository: CustomerRepository
) {

   fun save(customer: Customer) = customerRepository.save(customer)

}