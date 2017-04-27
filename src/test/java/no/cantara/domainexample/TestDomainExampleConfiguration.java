package no.cantara.domainexample;


import java.net.URI;
import java.net.URISyntaxException;

public class TestDomainExampleConfiguration implements DomainExampleConfiguration {

    @Override
    public URI getDomainExampleServerUri() {
        return createUri("http://vg.no");
    }

    @Override
    public String getUsername() {
        return "testuser";
    }

    @Override
    public String getPassword() {
        return "password";
    }


    private URI createUri(String uri) {
        try {
            return new URI(uri);
        } catch (URISyntaxException exception) {
            throw new RuntimeException(exception);
        }
    }
}
