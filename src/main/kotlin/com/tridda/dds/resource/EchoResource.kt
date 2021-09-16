package com.tridda.dds.resource

import com.tridda.dds.service.EchoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class EchoResource(
  private val echoService: EchoService
) {

  @GetMapping("/echo")
  fun echo(): String {
    return echoService.echo()
  }
}



