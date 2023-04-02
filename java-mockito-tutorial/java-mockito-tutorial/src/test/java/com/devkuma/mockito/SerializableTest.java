package com.devkuma.mockito;

import org.junit.jupiter.api.Test;

import java.io.Serializable;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.withSettings;

public class SerializableTest {

    @Test
    void test() {
        List<String> noSerializableMock = mock(List.class);
        System.out.println(noSerializableMock instanceof Serializable);

        List<String> serializableMock = mock(List.class, withSettings().serializable());
        System.out.println(serializableMock instanceof Serializable);
    }
}
