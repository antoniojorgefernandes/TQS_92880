# a
assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
assertThat(response.getBody()).extracting(Employee::getName).containsExactly("bob", "alex");

# b

when( service.save(Mockito.any()) ).thenReturn( alex);

# c

Use @Mock when unit testing your business logic (only using JUnit and Mockito). Use @MockBean when you write a test that is backed by a Spring Test Context and you want to add or replace a bean with a mocked version of it.

# d

The application-integrationtest.properties contains the details to configure the persistence storage. This will be used when @TestPropertySource isn't specified