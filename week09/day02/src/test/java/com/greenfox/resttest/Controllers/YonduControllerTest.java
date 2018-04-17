package com.greenfox.resttest.Controllers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = GuardianController.class)
@WebAppConfiguration
@EnableWebMvc
@AutoConfigureMockMvc

public class YonduControllerTest {


    @Autowired
    private MockMvc mockMvc;




    @Test
    public void guardianGetTest()throws Exception{
        mockMvc
                .perform(get("/yondu?distance=10?time=10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.distance").value("10"))
                .andExpect(jsonPath("$.time").value("10"))
                .andExpect(jsonPath("$.speed").value("1"));
    }


}