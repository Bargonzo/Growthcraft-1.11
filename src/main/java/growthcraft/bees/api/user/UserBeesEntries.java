package growthcraft.bees.api.user;

import java.util.ArrayList;
import java.util.List;

import growthcraft.core.api.schema.ICommentable;

public class UserBeesEntries implements ICommentable
{
	public String comment = "";
	public List<UserBeeEntry> data = new ArrayList<UserBeeEntry>();

	@Override
	public String getComment()
	{
		return comment;
	}

	@Override
	public void setComment(String com)
	{
		this.comment = com;
	}
}
