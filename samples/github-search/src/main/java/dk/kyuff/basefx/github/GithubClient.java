package dk.kyuff.basefx.github;

import dk.kyuff.basefx.github.model.RepositoryResult;

import javax.ws.rs.*;

/**
 * User: swi
 * Date: 23/07/14
 * Time: 16.15
 */
@Path("/search/repositories")
public interface GithubClient {

    @GET
    @Produces("application/json")
    RepositoryResult searchRepositories(@QueryParam("q") String query);

}
