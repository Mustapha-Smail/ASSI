package projet.resources;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
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

import projet.model.Article;
import projet.service.ArticleService;



@Path("/article")
public class ArticleResource {
	
	final ArticleService arts= new ArticleService(); 

    // Return the list of Articles to the user in the browser
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Article getArticleDetails(@PathParam("id") int id){
    	//
    	return arts.getArticleById(id);
    	
    }
	
	
	
}
