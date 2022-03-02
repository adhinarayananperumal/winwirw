package datetimeexp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeExp {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("the current date is " + date);

		LocalDateTime dt = LocalDateTime.now();
		
		DateTimeFormatter displayPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTime = dt.format(displayPattern);
		System.out.println("Indian Format " + formatedDateTime);
		
		
		
	    ZonedDateTime currentZone = ZonedDateTime.now();
		ZoneId ind = ZoneId.of("Asia/Singapore");
	    ZonedDateTime zt =
	            currentZone.withZoneSameInstant(ind);
		
		DateTimeFormatter displayPatternz = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTimez = dt.format(displayPatternz);
		System.out.println("Indian Format " + zt);
		
		ZoneId zone = ZoneId.of("Europe/Berlin");
		ZonedDateTime date11 = ZonedDateTime.now(zone);
		System.out.println(date11);

	}

}
