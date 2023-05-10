package com.java.JavaTestingEx.Controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@ExtendWith(SpringExtension.class)
@WebMvcTest(GetController.class)
class GetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getResult() throws Exception{
        RequestBuilder request = get("/getResult");
        MvcResult result = mockMvc.perform(request).andReturn();
        assertEquals("Hello, World", result.getResponse().getContentAsString());
    }

    @Test
    public void testWithGetResult() throws Exception{
        mockMvc.perform(get("/getResult")).andExpect(content().string("Hello, World"));
    }
}