package projet.resources;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import projet.model.Utilisateur;
import projet.service.UtilisateurService;




@Path("/utilisateur")
public class UtilisateurResource {

	// Allows to insert contextual objects into the class,
    // e.g. ServletContext, Request, Response, UriInfo
    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    
    final UtilisateurService uts = new UtilisateurService(); 
    
    
    @POST
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    public Utilisateur login(@FormParam("email") String email, @FormParam("password") String password){
    	return uts.login(password, email); 
    }
	
}
