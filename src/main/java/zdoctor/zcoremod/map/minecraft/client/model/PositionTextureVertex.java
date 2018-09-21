package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PositionTextureVertex {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brd";
		else
			return "net/minecraft/client/model/PositionTextureVertex";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brd";
		else
			return "PositionTextureVertex";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrd;";
		else
			return "Lnet/minecraft/client/model/PositionTextureVertex;";
	}

	/**
	 * <p>
	 * Name: vector3D
	 * </p>
	 */
	public static McObfPair field_78243_a = McMappingDatabase.getSRG("field_78243_a");

	/**
	 * <p>
	 * Name: setTexturePosition
	 * </p>
	 * <p>
	 * Desc: [(FF)Lnet/minecraft/client/model/PositionTextureVertex;]
	 * </p>
	 */
	public static McObfPair func_78240_a = McMappingDatabase.getSRG("PositionTextureVertex.func_78240_a");

	/**
	 * <p>
	 * Name: texturePositionY
	 * </p>
	 */
	public static McObfPair field_78242_c = McMappingDatabase.getSRG("field_78242_c");

	/**
	 * <p>
	 * Name: texturePositionX
	 * </p>
	 */
	public static McObfPair field_78241_b = McMappingDatabase.getSRG("field_78241_b");

}
