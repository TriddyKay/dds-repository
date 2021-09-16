package com.tridda.dds.config


import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import java.io.IOException
import javax.servlet.*
import javax.servlet.http.HttpServletResponse


@Configuration
@EnableWebMvc
class CorsConfig: Filter {

  @Throws(IOException::class, ServletException::class)
  override fun doFilter(req: ServletRequest?, res: ServletResponse, chain: FilterChain) {
    val response = res as HttpServletResponse
    response.setHeader("Access-Control-Allow-Origin", "*")
    response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE")
    response.setHeader("Access-Control-Max-Age", "3600")
    response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept")
    chain.doFilter(req, res)
  }

  override fun init(filterConfig: FilterConfig?) {}

  override fun destroy() {}
}
