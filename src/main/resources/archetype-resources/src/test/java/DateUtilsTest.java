package ${package};

import ${package}.utils.DateUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * TODO - Here are the date manipulations test, converts and the like, later delete this comment.
 * */
@AutoConfigureMockMvc
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class DateUtilsTest {

	private static final ZoneId ZONE_ID_SP = ZoneId.of("America/Sao_Paulo");
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy' às 'HH'h'mm");

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getCurrentDateFormatted() {
		String dateFormatted = DateUtils.getCurrentDateTimeFormated();

		assertNotNull(dateFormatted);
		assertEquals(ZonedDateTime.now(ZONE_ID_SP).format(DATE_TIME_FORMATTER), dateFormatted);
	}

}
