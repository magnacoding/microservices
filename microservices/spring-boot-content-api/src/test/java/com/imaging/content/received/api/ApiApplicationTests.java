package com.imaging.content.received.api;

import com.imaging.content.received.module.CoreApplication;
import com.imaging.content.received.module.domain.Document;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CoreApplication.class)
public class ApiApplicationTests {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    /*
     * converts a Document object into JSON String
     */
    private static String toJsonString(final Document obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void verifyGetDocument() throws Exception {
        LOGGER.info("Running Test to verify Document - Happy Path...");
        mockMvc.perform(MockMvcRequestBuilders.get("/documents/1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void verifyGetAllDocument() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/documents/all")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void verifyDeletedDocument() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/documents/delete/2")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void verifyCreateDocument() throws Exception {
        Document doc = new Document(8L, "testDocument", ".txt", 4);
        mockMvc.perform(MockMvcRequestBuilders.post("/documents/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(toJsonString(doc)))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void verifyInvalidDocument() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/documents/555")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

}
