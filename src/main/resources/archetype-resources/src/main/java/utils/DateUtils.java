package ${package}.utils;

import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * TODO - Here are the date manipulations, converts and the like, later delete this comment.
 * */
@Component
public class DateUtils {

	private static final ZoneId ZONE_ID_SP = ZoneId.of("America/Sao_Paulo");
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy' às 'HH'h'mm");

	public static String getCurrentDateTimeFormated() {
		return ZonedDateTime.now(ZONE_ID_SP).format(DATE_TIME_FORMATTER);
	}

}
