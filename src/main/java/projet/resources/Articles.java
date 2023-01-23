package projet.resources;


import java.io.IOException;
import java.util.ArrayList;
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

import projet.dao.ArticleDao;
import projet.model.Article;



@Path("/articles")
public class Articles {

	// Allows to insert contextual objects into the class,
    // e.g. ServletContext, Request, Response, UriInfo
    @Context
    UriInfo uriInfo;
    @Context
    Request request;

    // Return the list of Articles to the user in the browser
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Article> getArticlesBrowser() {
        List<Article> articles = new ArrayList<Article>();
        articles.addAll(ArticleDao.instance.getModel());
        System.out.println(articles.size()); 
        return articles;
    }
    
    @GET
    @Path("one")
    @Produces(MediaType.APPLICATION_JSON)
    public Article getOneArticleBrowser() {
    	Article art = ArticleDao.instance.getOne(); 
    	System.out.println(art);
    	return new Article("libelle", "marque", 100, "photo"); 
    }
	
	
	
}
