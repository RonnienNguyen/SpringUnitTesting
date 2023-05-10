package com.java.JavaTestingEx.Controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(GetControllerTest.class)
class GetControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    void helloController() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hello");
        MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
        assertEquals("Hello, Hello", mvcResult.getResponse().getContentAsString());
    }
    @Test
    public void testHelloWithName() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello?name=Dan"))
                .andExpect(content().string("Hello, Dan"));
    }
}