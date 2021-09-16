package com.tridda.dds.`interface`

import com.tridda.dds.domain.UserProfile
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface UserProfileDAO: MongoRepository<UserProfile, String> {
  fun findOneById(id: ObjectId): UserProfile
}
