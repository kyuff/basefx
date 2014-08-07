package dk.kyuff.basefx.github;

import dk.kyuff.basefx.github.model.RepositoryItem;
import dk.kyuff.basefx.github.model.RepositoryResult;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;

import java.util.Map;

import static org.junit.Assert.*;

public class GithubClientTest {

    GithubClient client;

    @Before
    public void setUp() throws Exception {
        GithubClientProducer producer = new GithubClientProducer();
        Client restClient = producer.createClient();
        client = producer.createGithubClient(restClient);
    }

    @Test
    public void testSearch() throws Exception {
        // setup
        // execute
        RepositoryResult result = client.searchRepositories("frede");
        // verify
        assertNotNull(result);
    }
}