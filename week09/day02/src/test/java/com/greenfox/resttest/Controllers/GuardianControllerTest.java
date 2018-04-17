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
public class GuardianControllerTest {

    @Autowired
    private MockMvc mockMvc;




    @Test
    public void guardianGetTest()throws Exception{
        mockMvc
                .perform(get("/groot?message=hi"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.recieved").value("hi"))
                .andExpect(jsonPath("$.translated").value("I am Groot"));
       }


    @Test
    public void guardianGetTestNoParam()throws Exception{
        mockMvc
                .perform(get("/groot"))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.errormsg").value("ERROR"));

       }
}