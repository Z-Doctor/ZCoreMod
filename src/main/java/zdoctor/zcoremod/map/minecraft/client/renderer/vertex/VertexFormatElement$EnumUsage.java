package zdoctor.zcoremod.map.minecraft.client.renderer.vertex;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VertexFormatElement$EnumUsage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceb$b";
		else
			return "net/minecraft/client/renderer/vertex/VertexFormatElement$EnumUsage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceb$b";
		else
			return "VertexFormatElement$EnumUsage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lceb$b;";
		else
			return "Lnet/minecraft/client/renderer/vertex/VertexFormatElement$EnumUsage;";
	}

	/**
	 * <p>
	 * Name: displayName
	 * </p>
	 */
	public static McObfPair field_177392_h = McMappingDatabase.getSRG("field_177392_h");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177384_a = McMappingDatabase.getSRG("VertexFormatElement$EnumUsage.func_177384_a");

}
