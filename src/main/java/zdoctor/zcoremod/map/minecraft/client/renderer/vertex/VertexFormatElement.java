package zdoctor.zcoremod.map.minecraft.client.renderer.vertex;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VertexFormatElement {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceb";
		else
			return "net/minecraft/client/renderer/vertex/VertexFormatElement";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceb";
		else
			return "VertexFormatElement";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lceb;";
		else
			return "Lnet/minecraft/client/renderer/vertex/VertexFormatElement;";
	}

	/**
	 * <p>
	 * Name: elementCount
	 * </p>
	 */
	public static McObfPair field_177378_e = McMappingDatabase.getSRG("field_177378_e");

	/**
	 * <p>
	 * Name: getElementCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177370_d = McMappingDatabase.getSRG("VertexFormatElement.func_177370_d");

	/**
	 * <p>
	 * Name: isFirstOrUV
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/client/renderer/vertex/VertexFormatElement$EnumUsage;)Z]
	 * </p>
	 */
	public static McObfPair func_177372_a = McMappingDatabase.getSRG("VertexFormatElement.func_177372_a");

	/**
	 * <p>
	 * Name: getIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177369_e = McMappingDatabase.getSRG("VertexFormatElement.func_177369_e");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_177381_a = McMappingDatabase.getSRG("field_177381_a");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/vertex/VertexFormatElement$EnumType;]
	 * </p>
	 */
	public static McObfPair func_177367_b = McMappingDatabase.getSRG("VertexFormatElement.func_177367_b");

	/**
	 * <p>
	 * Name: usage
	 * </p>
	 */
	public static McObfPair field_177380_c = McMappingDatabase.getSRG("field_177380_c");

	/**
	 * <p>
	 * Name: index
	 * </p>
	 */
	public static McObfPair field_177377_d = McMappingDatabase.getSRG("field_177377_d");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177368_f = McMappingDatabase.getSRG("VertexFormatElement.func_177368_f");

	/**
	 * <p>
	 * Name: isPositionElement
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177374_g = McMappingDatabase.getSRG("VertexFormatElement.func_177374_g");

	/**
	 * <p>
	 * Name: getUsage
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/vertex/VertexFormatElement$EnumUsage;]
	 * </p>
	 */
	public static McObfPair func_177375_c = McMappingDatabase.getSRG("VertexFormatElement.func_177375_c");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_177379_b = McMappingDatabase.getSRG("field_177379_b");

}
