package dk.kyuff.basefx.samples.github;

import dk.kyuff.basefx.github.GithubClient;
import dk.kyuff.basefx.github.model.RepositoryResult;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

import javax.inject.Inject;

/**
 * User: swi
 * Date: 23/07/14
 * Time: 20.56
 */
public class SearchService extends Service<RepositoryResult> {

    @Inject
    GithubClient githubClient;

    private String query;

    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    protected Task<RepositoryResult> createTask() {
        return new Task<RepositoryResult>() {
            @Override
            protected RepositoryResult call() throws Exception {
                return githubClient.searchRepositories(query);
            }
        };
    }
}
