package com.tridda.dds.resource

import com.tridda.dds.`interface`.UserProfileDAO
import com.tridda.dds.domain.UserProfile
import com.tridda.dds.domain.UserProfileRequest
import org.bson.types.ObjectId
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user-profile")
class UserProfileResource(
  private val userProfileDAO: UserProfileDAO
) {

  @GetMapping("/get-all")
  fun getAllUsers(): List<UserProfile> {
    return userProfileDAO.findAll()
  }

  @GetMapping("/user/{id}")
  fun getUser(@PathVariable("id") id: String): ResponseEntity<UserProfile> {
    val userProfile = userProfileDAO.findOneById(ObjectId(id))
    return ResponseEntity.ok(userProfile)
  }

  @PostMapping("/create")
  fun createUserProfile(@RequestBody request: UserProfileRequest): ResponseEntity<UserProfile> {
    val userProfile = userProfileDAO.save(
      UserProfile(
      username = request.username,
      email = request.email,
      password = request.password
    )
    )

    return ResponseEntity(userProfile, HttpStatus.CREATED)
  }

  @PutMapping("/update/{id}")
  fun updateUserProfile(
    @RequestBody request: UserProfileRequest,
    @PathVariable("id") id: String)
  : ResponseEntity<UserProfile> {
    val task = userProfileDAO.findOneById(ObjectId(id))
    val updatedTask = userProfileDAO.save(
      UserProfile(
      id = task.id,
      username = request.username,
      email = request.email,
      password = request.password
    )
    )
    return ResponseEntity.ok(updatedTask)
  }

  @DeleteMapping("/delete/{id}")
  fun deleteTask(@PathVariable("id") id: String): ResponseEntity<Unit> {
    userProfileDAO.deleteById(id)
    return ResponseEntity.noContent().build()
  }
}



