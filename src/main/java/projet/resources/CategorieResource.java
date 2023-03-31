package projet.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import projet.model.Article;
import projet.model.Categorie;
import projet.service.CategorieService;



@Path("/categories")
public class CategorieResource {

	// Allows to insert contextual objects into the class,
    // e.g. ServletContext, Request, Response, UriInfo
    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    
    final CategorieService cts = new CategorieService(); 
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Categorie> getCategories(){
    	//
    	return cts.getCategories(); 
    }
    

    @GET
    @Path("/sub")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Categorie> getSubCategories(){
    	//
    	return cts.getSubCategories(); 
    }

    // Return the list of Articles to the user in the browser
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Article> getArticlesByCategoryId(@PathParam("id") int id){
    	//
    	System.out.println(id);
    	return cts.getArticlesByCategoryId(id);
    	
    }
    
	
	
	
}
