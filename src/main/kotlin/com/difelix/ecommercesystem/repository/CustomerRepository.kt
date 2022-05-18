package com.difelix.ecommercesystem.repository

import com.difelix.ecommercesystem.domain.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : CrudRepository<Customer, Int>