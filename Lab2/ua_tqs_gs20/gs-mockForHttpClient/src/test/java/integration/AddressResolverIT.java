package integration;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import connection.*;
import geocoding.*;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;

public class AddressResolverIT {


    @BeforeEach
    public void init(){
    }

    @Test
    public void whenGoodCoordidates_returnAddress() throws IOException, URISyntaxException, ParseException {
        ISimpleHttpClient cl = new TqsBasicHttpClient();
        AddressResolver resolver = new AddressResolver(cl);
        Address add = new Address( "Cais do Alboi", "Glória e Vera Cruz", "Centro", "3800-246", null);
        Address good_Add = resolver.findAddressForLocation(40.640661, -8.656688);
        assertThat(good_Add,is(add));
    }

    @Test
    public void whenBadCoordidates_trhowBadArrayindex() throws IOException, URISyntaxException, ParseException {
        ISimpleHttpClient cl = new TqsBasicHttpClient();
        AddressResolver resolver = new AddressResolver(cl);
        assertThrows(IndexOutOfBoundsException.class, () ->{resolver.findAddressForLocation(-99999999, -8.656688);});
    }

}
