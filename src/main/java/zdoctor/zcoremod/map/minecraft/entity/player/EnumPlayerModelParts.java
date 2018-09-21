package zdoctor.zcoremod.map.minecraft.entity.player;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumPlayerModelParts {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aee";
		else
			return "net/minecraft/entity/player/EnumPlayerModelParts";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aee";
		else
			return "EnumPlayerModelParts";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laee;";
		else
			return "Lnet/minecraft/entity/player/EnumPlayerModelParts;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_179339_k = McMappingDatabase.getSRG("field_179339_k");

	/**
	 * <p>
	 * Name: partMask
	 * </p>
	 */
	public static McObfPair field_179341_i = McMappingDatabase.getSRG("field_179341_i");

	/**
	 * <p>
	 * Name: partName
	 * </p>
	 */
	public static McObfPair field_179338_j = McMappingDatabase.getSRG("field_179338_j");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_179326_d = McMappingDatabase.getSRG("EnumPlayerModelParts.func_179326_d");

	/**
	 * <p>
	 * Name: getPartMask
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179327_a = McMappingDatabase.getSRG("EnumPlayerModelParts.func_179327_a");

	/**
	 * <p>
	 * Name: getPartName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179329_c = McMappingDatabase.getSRG("EnumPlayerModelParts.func_179329_c");

	/**
	 * <p>
	 * Name: partId
	 * </p>
	 */
	public static McObfPair field_179340_h = McMappingDatabase.getSRG("field_179340_h");

	/**
	 * <p>
	 * Name: getPartId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179328_b = McMappingDatabase.getSRG("EnumPlayerModelParts.func_179328_b");

}
