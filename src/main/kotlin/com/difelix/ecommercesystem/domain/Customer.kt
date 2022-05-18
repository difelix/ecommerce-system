package com.difelix.ecommercesystem.domain

import com.difelix.ecommercesystem.domain.enums.CustomerType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "customer")
data class Customer(

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   val id: Int? = null,

   @Column(name = "name", nullable = false)
   val name: String? = null,

   @Column(name = "email", nullable = false, unique = true)
   val email: String? = null,

   @Column(name = "cpf_cnpj", nullable = false, unique = true)
   val cpfOrCnpj: String? = null,

   @Column(name = "type", nullable = false)
   @Enumerated(value = EnumType.STRING)
   var type: CustomerType? = CustomerType.PESSOAFISICA

)
