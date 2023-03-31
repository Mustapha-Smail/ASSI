package projet.resources;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
	// Allows to insert contextual objects into the class,
    // e.g. ServletContext, Request, Response, UriInfo
    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    
	final ArticleService arts= new ArticleService(); 

	// Add article 
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public int addArticle(
			@FormParam("idCategorie") int idCategorie, 
			@FormParam("libelle") String libelle, 
    		@FormParam("marque") String marque, 
    		@FormParam("prix") int prix, 
    		@FormParam("photo") String photo ) {
		return arts.addArticle(idCategorie, libelle, marque, prix, photo); 
	}
	
    // Return the list of Articles to the user in the browser
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Article getArticleDetails(@PathParam("id") int id){
    	//
    	return arts.getArticleById(id);
    	
    }
    
    // Edit article 
    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Article editArticle(
    		@PathParam("id") int idArticle, 
    		@FormParam("libelle") String libelle, 
    		@FormParam("marque") String marque, 
    		@FormParam("prix") int prix, 
    		@FormParam("photo") String photo 
		){
    	//
    	return arts.editArticle(idArticle, libelle, marque, prix, photo);
    	
    }
    
    // Delete article 
    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public int deleteArticle(@PathParam("id") int idArticle) {
    	return arts.deleteArticle(idArticle); 
    }
	

    // Return the list of Articles to the user in the browser
    @GET
    @Path("categorie/{idCategorie}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Article> getCategoryArticles(@PathParam("idCategorie") int idCategorie){
    	//
    	return arts.getArticlesByCategory(idCategorie);
    	
    }
	
	
}
