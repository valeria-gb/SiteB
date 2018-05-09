package prode;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.BelongsToParents;
@BelongsToParents({
	@BelongsTo(foreignKeyName="local_team_id",parent=Team.class),
	@BelongsTo(foreignKeyName="visit_team_id",parent=Team.class)
})

import java.util.Date;

public class Match extends Model {
	static{
    validatePresenceOf("day").message("Please, provide date");
    validatePresenceOf("schedule").message("Please, provide schedule");
  }

}
