package community.bioji;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/schedule")
public class ScheduleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String possibleDates() {
        return "Central European Summer Time (CEST): Thursday 10am or Friday 1pm";
    }
}
