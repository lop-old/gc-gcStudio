package com.growcontrol.studio;

import com.poixson.utils.Keeper;
import com.growcontrol.common.gcCommonDefines;


public final class gcStudioDefines {
	private gcStudioDefines() {}
	{ Keeper.add(new gcStudioDefines()); }



	// logger name
	public static final String LOG_NAME = gcCommonDefines.LOG_NAME_CLIENT;

	public static final String WINDOW_TITLE = "gcStudio";



	// defaults



	// studio config
	public static final String CONFIG_FILE = "studio.yml";



}
