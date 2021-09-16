package com.tridda.dds

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.client.MongoClients
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import io.github.cdimascio.dotenv.dotenv


@SpringBootApplication
class DDsApplication {
	companion object {
		private val dotenv = dotenv()
		@JvmStatic
		fun main(args: Array<String>) {
			SpringApplication.run(DDsApplication::class.java, *args)
			val connectionString =
				ConnectionString(dotenv["MONGODB_CONNECTION"])
			val settings = MongoClientSettings.builder()
				.applyConnectionString(connectionString)
				.build()
			MongoClients.create(settings)
		}
	}
}
