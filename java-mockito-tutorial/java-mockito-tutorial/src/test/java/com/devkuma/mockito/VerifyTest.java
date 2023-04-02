package com.devkuma.mockito;

import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;

public class VerifyTest {

    @Test
    void test() {
        List<String> mock = mock(List.class);

        mock.get(1);

        verify(mock).get(0);
    }

    @Test
    void testVerifyWithArgumentMatcher() {
        List<String> mock = mock(List.class);

        mock.add("one");
        mock.add("two");
        mock.add("three");

        verify(mock).add(startsWith("th")); // 테스트 통과
    }

    @Test
    void testVerifyInvocationCount() {
        List<String> mock = mock(List.class);

        mock.get(0);
        mock.get(0);
        mock.get(0);

        verify(mock, times(2)).get(0);
    }

    @Test
    void testAtLeast() {
        List<String> mock = mock(List.class);

        mock.get(0);

        verify(mock, atLeast(2)).get(0);
    }

    @Test
    void testAtMost() {
        List<String> mock = mock(List.class);

        mock.get(0);
        mock.get(0);
        mock.get(0);

        verify(mock, atMost(2)).get(0);
    }

    @Test
    void testNever() {
        List<String> mock = mock(List.class);

        mock.get(0);

        verify(mock, never()).get(0);
    }

    @Test
    void testInvocationOrder() {
        List<String> mock = mock(List.class);

        mock.get(0);
        mock.get(2);
        mock.get(1);

        InOrder inOrder = inOrder(mock);

        inOrder.verify(mock).get(0);
        inOrder.verify(mock).get(1);
        inOrder.verify(mock).get(2);
    }

    @Test
    void testInvocationOrderWithMultipleMocks() {
        List<String> mock1 = mock(List.class);
        List<String> mock2 = mock(List.class);

        mock1.get(0);
        mock1.get(2);
        mock2.get(1);

        InOrder inOrder = inOrder(mock1, mock2);

        inOrder.verify(mock1).get(0);
        inOrder.verify(mock2).get(1);
        inOrder.verify(mock1).get(2);
    }

    @Test
    void testCaptor() {
        List<String> mock = mock(List.class);

        mock.get(0);
        mock.get(1);
        mock.get(9);

        ArgumentCaptor<Integer> captor = ArgumentCaptor.forClass(Integer.class);

        verify(mock, times(3)).get(captor.capture());

        System.out.println("captor.getValue()     = " + captor.getValue());
        System.out.println("captor.getAllValues() = " + captor.getAllValues());
    }
}
