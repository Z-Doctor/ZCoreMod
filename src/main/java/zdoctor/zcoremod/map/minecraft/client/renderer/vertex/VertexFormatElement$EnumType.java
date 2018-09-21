package zdoctor.zcoremod.map.minecraft.client.renderer.vertex;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VertexFormatElement$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceb$a";
		else
			return "net/minecraft/client/renderer/vertex/VertexFormatElement$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceb$a";
		else
			return "VertexFormatElement$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lceb$a;";
		else
			return "Lnet/minecraft/client/renderer/vertex/VertexFormatElement$EnumType;";
	}

	/**
	 * <p>
	 * Name: displayName
	 * </p>
	 */
	public static McObfPair field_177408_i = McMappingDatabase.getSRG("field_177408_i");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177395_a = McMappingDatabase.getSRG("VertexFormatElement$EnumType.func_177395_a");

	/**
	 * <p>
	 * Name: size
	 * </p>
	 */
	public static McObfPair field_177407_h = McMappingDatabase.getSRG("field_177407_h");

	/**
	 * <p>
	 * Name: getGlConstant
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177397_c = McMappingDatabase.getSRG("VertexFormatElement$EnumType.func_177397_c");

	/**
	 * <p>
	 * Name: glConstant
	 * </p>
	 */
	public static McObfPair field_177405_j = McMappingDatabase.getSRG("field_177405_j");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177396_b = McMappingDatabase.getSRG("VertexFormatElement$EnumType.func_177396_b");

}
