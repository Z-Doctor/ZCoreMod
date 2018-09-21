package zdoctor.zcoremod;

public class Config {
	public static final boolean GENERATEENTRIES = false;
	
//	As found in net.minecraftforge.gradle.GradleStartCommon
//	System.setProperty("net.minecraftforge.gradle.GradleStart.srg.notch-srg", SRG_NOTCH_SRG.getCanonicalPath());
//	System.setProperty("net.minecraftforge.gradle.GradleStart.srg.notch-mcp", SRG_NOTCH_MCP.getCanonicalPath());
//	System.setProperty("net.minecraftforge.gradle.GradleStart.srg.srg-mcp", SRG_SRG_MCP.getCanonicalPath());
//	System.setProperty("net.minecraftforge.gradle.GradleStart.srg.mcp-srg", SRG_MCP_SRG.getCanonicalPath());
//	System.setProperty("net.minecraftforge.gradle.GradleStart.srg.mcp-notch", SRG_MCP_NOTCH.getCanonicalPath());
//	System.setProperty("net.minecraftforge.gradle.GradleStart.csvDir", CSV_DIR.getCanonicalPath());

	public static final String USERDIR = System.getProperty("user.home").replaceAll("\\\\", "/");
	public static final String GRADLE = ".gradle/caches/minecraft/de/oceanlabs/mcp/mcp_snapshot";
	public static final String NOTCHSRG = "srgs/notch-srg.srg";
	public static final String SNAPSHOT = "20171003";
	public static final String VERSION = "1.12.2";

	public static final String PATH = USERDIR + "/" + GRADLE + "/" + SNAPSHOT;

	public static final String SRG = PATH + "/" + VERSION + "/" + NOTCHSRG;


	public static final String ENTRYSTART = "package zdoctor.zcoremod.map.%s;\r\n" + "\r\n"
			+ "import zdoctor.zcoremod.CoreModFMLLoadPlugin;\r\nimport zdoctor.zcoremod.map.pair.McObfPair;\r\nimport zdoctor.zcoremod.map.McMappingDatabase;\r\n"
			+ "\r\n" + "public class %s {\n\n";

	public static final String ENTRYEND = "}\n";

	public static final String ENTRYFORMAT = "public static McObfPair %s = McMappingDatabase.getSRG(\"%s\");\n\n";

	public static final String FIELDFORMATCOMMENT = "/**\r\n" + "	 * <p>\r\n" + "	 * Name: %s\r\n" + "	 * </p>\r\n"
			+ "	 */\n";
	public static final String FUNCFORMATCOMMENT = "/**\r\n" + "	 * <p>\r\n" + "	 * Name: %s\r\n" + "	 * </p>\r\n"
			+ "	 * <p>\r\n" + "	 * Desc: %s\r\n" + "	 * </p>\r\n" + "	 */\n";

	public static final String GETKEY = "\tpublic static String getKey() {\r\n" + "		return getClassName().replaceAll(\"/\", \".\");\r\n" + "	}\n\n";

	public static final String GETCLASSNAME = "\tpublic static String getClassName() {\r\n"
			+ "		if (CoreModFMLLoadPlugin.isObfuscated)\r\n" + "			return \"%s\";\r\n" + "		else\r\n"
			+ "			return \"%s\";\r\n" + "	}\n\n";
	
	public static final String GETNAME = "\tpublic static String getName() {\r\n"
			+ "		if (CoreModFMLLoadPlugin.isObfuscated)\r\n" + "			return \"%s\";\r\n" + "		else\r\n"
			+ "			return \"%s\";\r\n" + "	}\n\n";

	public static final String GETDESCRIPTOR = "\tpublic static String getDescriptor() {\r\n"
			+ "		if (CoreModFMLLoadPlugin.isObfuscated)\r\n" + "			return \"%s\";\r\n" + "		else\r\n"
			+ "			return \"%s\";\r\n" + "	}\n\n";

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "%s";
		else
			return "%s";
	}
}
