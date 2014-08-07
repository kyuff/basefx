package dk.kyuff.basefx.github;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import java.io.IOException;

/**
 * User: swi
 * Date: 23/07/14
 * Time: 19.40
 */
public class HeaderRequestFilter implements ClientRequestFilter {

    private String header;
    private String value;

    public HeaderRequestFilter(String header, String value) {
        this.header = header;
        this.value = value;
    }

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        requestContext.getHeaders().add(header, value);
    }
}
