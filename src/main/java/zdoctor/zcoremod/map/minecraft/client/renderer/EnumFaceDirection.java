package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumFaceDirection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bup";
		else
			return "net/minecraft/client/renderer/EnumFaceDirection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bup";
		else
			return "EnumFaceDirection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbup;";
		else
			return "Lnet/minecraft/client/renderer/EnumFaceDirection;";
	}

	/**
	 * <p>
	 * Name: FACINGS
	 * </p>
	 */
	public static McObfPair field_179029_g = McMappingDatabase.getSRG("field_179029_g");

	/**
	 * <p>
	 * Name: getVertexInformation
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/renderer/EnumFaceDirection$VertexInformation;]
	 * </p>
	 */
	public static McObfPair func_179025_a = McMappingDatabase.getSRG("EnumFaceDirection.func_179025_a");

	/**
	 * <p>
	 * Name: getFacing
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/client/renderer/EnumFaceDirection;]
	 * </p>
	 */
	public static McObfPair func_179027_a = McMappingDatabase.getSRG("EnumFaceDirection.func_179027_a");

	/**
	 * <p>
	 * Name: vertexInfos
	 * </p>
	 */
	public static McObfPair field_179035_h = McMappingDatabase.getSRG("field_179035_h");

}
