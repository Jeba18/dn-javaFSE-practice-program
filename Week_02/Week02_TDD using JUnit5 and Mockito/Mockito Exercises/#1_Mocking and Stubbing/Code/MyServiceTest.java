package com.jona.mockdemo;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

// External API (to be mocked)
interface ExternalApi {
    String getData();
}

// Service using the API
class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();  // Calls external API
    }
}

// Test using Mockito
public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into service
        MyService service = new MyService(mockApi);

        // Step 4: Call method and assert
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
