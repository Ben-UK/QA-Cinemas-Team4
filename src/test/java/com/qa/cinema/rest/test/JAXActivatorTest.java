package com.qa.cinema.rest.test;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import com.qa.cinema.rest.JAXActivator;

public class JAXActivatorTest {

    @Test
    public void test() {
	JAXActivator jax = new JAXActivator();
	Map<String,Object> emptyMap = jax.getProperties();
	assertTrue(emptyMap.isEmpty());
    }

}
