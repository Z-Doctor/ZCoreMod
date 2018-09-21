package zdoctor.zcoremod.map.minecraft.potion;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PotionType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akg";
		else
			return "net/minecraft/potion/PotionType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "akg";
		else
			return "PotionType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lakg;";
		else
			return "Lnet/minecraft/potion/PotionType;";
	}

	/**
	 * <p>
	 * Name: nextPotionTypeId
	 * </p>
	 */
	public static McObfPair field_185178_c = McMappingDatabase.getSRG("field_185178_c");

	/**
	 * <p>
	 * Name: registerPotionTypes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_185175_b = McMappingDatabase.getSRG("PotionType.func_185175_b");

	/**
	 * <p>
	 * Name: hasInstantEffect
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185172_c = McMappingDatabase.getSRG("PotionType.func_185172_c");

	/**
	 * <p>
	 * Name: EMPTY
	 * </p>
	 */
	public static McObfPair field_185177_b = McMappingDatabase.getSRG("field_185177_b");

	/**
	 * <p>
	 * Name: getEffects
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_185170_a = McMappingDatabase.getSRG("PotionType.func_185170_a");

	/**
	 * <p>
	 * Name: effects
	 * </p>
	 */
	public static McObfPair field_185180_e = McMappingDatabase.getSRG("field_185180_e");

	/**
	 * <p>
	 * Name: registerPotionType
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/potion/PotionType;)V]
	 * </p>
	 */
	public static McObfPair func_185173_a = McMappingDatabase.getSRG("PotionType.func_185173_a");

	/**
	 * <p>
	 * Name: getNamePrefixed
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_185174_b = McMappingDatabase.getSRG("PotionType.func_185174_b");

	/**
	 * <p>
	 * Name: baseName
	 * </p>
	 */
	public static McObfPair field_185179_d = McMappingDatabase.getSRG("field_185179_d");

	/**
	 * <p>
	 * Name: REGISTRY
	 * </p>
	 */
	public static McObfPair field_185176_a = McMappingDatabase.getSRG("field_185176_a");

	/**
	 * <p>
	 * Name: getPotionTypeForName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/potion/PotionType;]
	 * </p>
	 */
	public static McObfPair func_185168_a = McMappingDatabase.getSRG("PotionType.func_185168_a");

}
