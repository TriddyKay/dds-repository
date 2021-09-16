package com.tridda.dds.dao

import org.springframework.stereotype.Service

@Service
class EchoDAO {
  fun echo(): String {
    return "ECHO EchO echo"
  }
}
