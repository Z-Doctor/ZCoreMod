package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBed {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bph";
		else
			return "net/minecraft/client/model/ModelBed";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bph";
		else
			return "ModelBed";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbph;";
		else
			return "Lnet/minecraft/client/model/ModelBed;";
	}

	/**
	 * <p>
	 * Name: legs
	 * </p>
	 */
	public static McObfPair field_193774_c = McMappingDatabase.getSRG("field_193774_c");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193771_b = McMappingDatabase.getSRG("ModelBed.func_193771_b");

	/**
	 * <p>
	 * Name: preparePiece
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_193769_a = McMappingDatabase.getSRG("ModelBed.func_193769_a");

	/**
	 * <p>
	 * Name: headPiece
	 * </p>
	 */
	public static McObfPair field_193772_a = McMappingDatabase.getSRG("field_193772_a");

	/**
	 * <p>
	 * Name: getModelVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_193770_a = McMappingDatabase.getSRG("ModelBed.func_193770_a");

	/**
	 * <p>
	 * Name: footPiece
	 * </p>
	 */
	public static McObfPair field_193773_b = McMappingDatabase.getSRG("field_193773_b");

}
