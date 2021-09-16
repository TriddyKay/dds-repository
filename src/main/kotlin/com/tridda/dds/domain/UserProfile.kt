package com.tridda.dds.domain

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class UserProfile (
  @Id
  val id: String = ObjectId.get().toString(),
  val username: String,
  val email: String,
  val password: String,
//  val createdDate: LocalDateTime = LocalDateTime.now(),
//  val modifiedDate: LocalDateTime = LocalDateTime.now()
)
