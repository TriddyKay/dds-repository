//package com.dinner.club.tridstable.service
//
//import com.dinner.club.tridstable.`interface`.UserProfileDAO
//import com.dinner.club.tridstable.domain.UserProfile
//import org.bson.types.ObjectId
//import org.springframework.stereotype.Service
//
//@Service
//class UserProfileService(
//  private val userProfileDAO: UserProfileDAO
//) {
//  fun getAllUsers(): List<UserProfile> {
//    return userProfileDAO.getAllUsers()
//  }
//
//  fun getUser(id: ObjectId): UserProfile {
//    return userProfileDAO.findUser(id)
//  }
//
//  fun createUserProfile(request: UserProfileRequest): ResponseEntity<UserProfile> {
//    val userProfile = userProfileDAO.save(UserProfile(
//      name = request.name,
//      password = request.password
//    ))
//    return ResponseEntity(userProfile, HttpStatus.CREATED)
//  }
//}
