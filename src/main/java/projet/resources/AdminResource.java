package projet.resources;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import projet.model.Administrateur;
import projet.service.AdminService;

@Path("/admin")
public class AdminResource {

	// Allows to insert contextual objects into the class,
    // e.g. ServletContext, Request, Response, UriInfo
    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    
    final AdminService ads = new AdminService(); 
    
    @POST
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    public Administrateur login(@FormParam("email") String email, @FormParam("password") String password){
    	return ads.login(password, email); 
    }
	
}
