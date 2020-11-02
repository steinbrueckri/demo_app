package org.acme.rest

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/ok")
class ok {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "ok"
}

@Path("/err")
class err {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "err"
}

@Path("/hello")
class hello {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello world"
}