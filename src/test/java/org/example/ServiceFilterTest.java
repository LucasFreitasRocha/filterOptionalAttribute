package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class ServiceFilterTest {

    @InjectMocks
    private ServiceFilter serviceFilter;

    @Test
    public void shouldBeReturnAListWhitTwoElementWhenAreaBearea2() {
        ModelFilter compare = new ModelFilter("area2", "", "");
        assertEquals(Integer.valueOf(2), serviceFilter.filter(compare).size());
    }

    @Test
    public void shouldBeReturnAListWhitOneElementWhenAreaBearea1() {
        ModelFilter compare = new ModelFilter("area1", "", "");
        assertEquals(Integer.valueOf(1), serviceFilter.filter(compare).size());
    }

    @Test
    public void shouldBeReturnAListWhitZeroElementWhenModelacp1() {
        ModelFilter compare = new ModelFilter("area1", "code1", "product1");
        assertTrue(serviceFilter.filter(compare).isEmpty());
    }

}