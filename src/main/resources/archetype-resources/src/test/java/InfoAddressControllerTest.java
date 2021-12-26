package ${package};

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * TODO - Test of Controlher Info Address, later delete this comment.
 * */
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest
public class InfoAddressControllerTest {

	private static final String ZIP_CODE = "66820000";

	@Autowired
	private WebApplicationContext webAppContext;

	@Autowired
	private MockMvc mockMvc;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.webAppContextSetup(webAppContext).build();
	}

	@Test
	public void getInfoAddressWithSuccess() throws Exception {
		mockMvc.perform(get("/address/v1/info/{zipCode}", ZIP_CODE)
					.content(String.valueOf(MediaType.APPLICATION_JSON)))
					.andExpect(status().isOk());
	}

	@Test(expected = IllegalArgumentException.class)
	public void getInfoAddress() throws Exception {
		mockMvc.perform(get("/address/v1/info/{zipCode}")
						.content(String.valueOf(MediaType.APPLICATION_JSON)))
				.andExpect(status().isBadRequest());
	}

}
