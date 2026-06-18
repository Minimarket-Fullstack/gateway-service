import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.cloud.client.discovery.DiscoveryClient;


@ExtendWith(MockitoExtension.class)
class GatewayServiceMockitoTest {

    @Mock
    private DiscoveryClient discoveryClient;

    @Test
    void debeSimularServiciosRegistradosEnEureka() {
        when(discoveryClient.getServices()).thenReturn(List.of("producto-service", "cliente-service"));

        assertTrue(discoveryClient.getServices().contains("producto-service"));

        verify(discoveryClient, times(1)).getServices();
    }



    @Test
    void debeRetornarListaVaciaSiNoHayServiciosRegistrados() {
        when(discoveryClient.getServices()).thenReturn(Collections.emptyList());

        List<String> servicios = discoveryClient.getServices();

        assertTrue(servicios.isEmpty());
        verify(discoveryClient).getServices();
    }

    @Test
    void debeValidarQueClienteServiceEsteRegistrado() {
        when(discoveryClient.getServices()).thenReturn(List.of("producto-service", "cliente-service", "venta-service"));

        List<String> servicios = discoveryClient.getServices();

        assertTrue(servicios.contains("cliente-service"));
        assertEquals(3, servicios.size());
        verify(discoveryClient).getServices();
    }
}
