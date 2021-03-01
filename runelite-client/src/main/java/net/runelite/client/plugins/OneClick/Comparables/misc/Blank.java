package net.runelite.client.plugins.OneClick.Comparables.misc;

import net.runelite.api.MenuEntry;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.client.plugins.OneClick.Comparables.ClickCompare;

public class Blank extends ClickCompare
{
	@Override
	public boolean isEntryValid(MenuEntry event)
	{
		return false;
	}

	@Override
	public void modifyEntry(MenuEntry event)
	{

	}

	@Override
	public boolean isClickValid(MenuOptionClicked event)
	{
		return false;
	}

	@Override
	public void modifyClick(MenuOptionClicked event)
	{

	}

	@Override
	public void backupEntryModify(MenuEntry e)
	{

	}
}
