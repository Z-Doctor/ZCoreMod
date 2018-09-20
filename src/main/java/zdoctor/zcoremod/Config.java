package zdoctor.zcoremod;

public class Config {
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
}
