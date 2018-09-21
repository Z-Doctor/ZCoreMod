package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumFaceDirection$VertexInformation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bup$b";
		else
			return "net/minecraft/client/renderer/EnumFaceDirection$VertexInformation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bup$b";
		else
			return "EnumFaceDirection$VertexInformation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbup$b;";
		else
			return "Lnet/minecraft/client/renderer/EnumFaceDirection$VertexInformation;";
	}

	/**
	 * <p>
	 * Name: xIndex
	 * </p>
	 */
	public static McObfPair field_179184_a = McMappingDatabase.getSRG("field_179184_a");

	/**
	 * <p>
	 * Name: yIndex
	 * </p>
	 */
	public static McObfPair field_179182_b = McMappingDatabase.getSRG("field_179182_b");

	/**
	 * <p>
	 * Name: zIndex
	 * </p>
	 */
	public static McObfPair field_179183_c = McMappingDatabase.getSRG("field_179183_c");

}
