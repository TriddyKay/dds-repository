package com.tridda.dds.service

import com.tridda.dds.dao.EchoDAO
import org.springframework.stereotype.Service

@Service
class EchoService(
  private val echoDAO: EchoDAO
) {
  fun echo(): String {
    return echoDAO.echo()
  }
}
