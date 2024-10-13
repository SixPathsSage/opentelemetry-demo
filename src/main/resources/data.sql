CREATE TABLE IF NOT EXISTS event (
    id BIGINT PRIMARY KEY,
    event_name VARCHAR(256)
);

insert into event(id, event_name) values
(1, 'Intro to OpenTelemetry'),
(2, 'Intro to Keycloak'),
(3, 'Intro to Nginx'),
(4, 'Features of Java 21'),
(5, 'Functional Programming with Java'),
(6, 'Unit Testing with Junit and Mockito'),
(7, 'Test Containers to the rescue'),
(8, 'Single Sign On with Keycloak'),
(9, 'How and When to user Design Patterns'),
(10, 'Intro to AWS')
ON CONFLICT (id) DO NOTHING;