package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amz";
		else
			return "net/minecraft/world/WorldType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amz";
		else
			return "WorldType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamz;";
		else
			return "Lnet/minecraft/world/WorldType;";
	}

	/**
	 * <p>
	 * Name: FLAT
	 * </p>
	 */
	public static McObfPair field_77138_c = McMappingDatabase.getSRG("field_77138_c");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82747_f = McMappingDatabase.getSRG("WorldType.func_82747_f");

	/**
	 * <p>
	 * Name: setVersioned
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldType;]
	 * </p>
	 */
	public static McObfPair func_77129_f = McMappingDatabase.getSRG("WorldType.func_77129_f");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_77133_f = McMappingDatabase.getSRG("field_77133_f");

	/**
	 * <p>
	 * Name: getVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77131_c = McMappingDatabase.getSRG("WorldType.func_77131_c");

	/**
	 * <p>
	 * Name: isVersioned
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77125_e = McMappingDatabase.getSRG("WorldType.func_77125_e");

	/**
	 * <p>
	 * Name: enableInfoNotice
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldType;]
	 * </p>
	 */
	public static McObfPair func_151358_j = McMappingDatabase.getSRG("WorldType.func_151358_j");

	/**
	 * <p>
	 * Name: canBeCreated
	 * </p>
	 */
	public static McObfPair field_77140_h = McMappingDatabase.getSRG("field_77140_h");

	/**
	 * <p>
	 * Name: LARGE_BIOMES
	 * </p>
	 */
	public static McObfPair field_77135_d = McMappingDatabase.getSRG("field_77135_d");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_82748_f = McMappingDatabase.getSRG("field_82748_f");

	/**
	 * <p>
	 * Name: setCanBeCreated
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/world/WorldType;]
	 * </p>
	 */
	public static McObfPair func_77124_a = McMappingDatabase.getSRG("WorldType.func_77124_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77127_a = McMappingDatabase.getSRG("WorldType.func_77127_a");

	/**
	 * <p>
	 * Name: DEFAULT_1_1
	 * </p>
	 */
	public static McObfPair field_77136_e = McMappingDatabase.getSRG("field_77136_e");

	/**
	 * <p>
	 * Name: getInfoTranslationKey
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151359_c = McMappingDatabase.getSRG("WorldType.func_151359_c");

	/**
	 * <p>
	 * Name: DEFAULT
	 * </p>
	 */
	public static McObfPair field_77137_b = McMappingDatabase.getSRG("field_77137_b");

	/**
	 * <p>
	 * Name: parseWorldType
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/world/WorldType;]
	 * </p>
	 */
	public static McObfPair func_77130_a = McMappingDatabase.getSRG("WorldType.func_77130_a");

	/**
	 * <p>
	 * Name: hasInfoNotice
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_151357_h = McMappingDatabase.getSRG("WorldType.func_151357_h");

	/**
	 * <p>
	 * Name: version
	 * </p>
	 */
	public static McObfPair field_77134_g = McMappingDatabase.getSRG("field_77134_g");

	/**
	 * <p>
	 * Name: hasInfoNotice
	 * </p>
	 */
	public static McObfPair field_151361_l = McMappingDatabase.getSRG("field_151361_l");

	/**
	 * <p>
	 * Name: AMPLIFIED
	 * </p>
	 */
	public static McObfPair field_151360_e = McMappingDatabase.getSRG("field_151360_e");

	/**
	 * <p>
	 * Name: getWorldTypeForGeneratorVersion
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/world/WorldType;]
	 * </p>
	 */
	public static McObfPair func_77132_a = McMappingDatabase.getSRG("WorldType.func_77132_a");

	/**
	 * <p>
	 * Name: CUSTOMIZED
	 * </p>
	 */
	public static McObfPair field_180271_f = McMappingDatabase.getSRG("field_180271_f");

	/**
	 * <p>
	 * Name: getTranslationKey
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77128_b = McMappingDatabase.getSRG("WorldType.func_77128_b");

	/**
	 * <p>
	 * Name: DEBUG_ALL_BLOCK_STATES
	 * </p>
	 */
	public static McObfPair field_180272_g = McMappingDatabase.getSRG("field_180272_g");

	/**
	 * <p>
	 * Name: canBeCreated
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77126_d = McMappingDatabase.getSRG("WorldType.func_77126_d");

	/**
	 * <p>
	 * Name: WORLD_TYPES
	 * </p>
	 */
	public static McObfPair field_77139_a = McMappingDatabase.getSRG("field_77139_a");

	/**
	 * <p>
	 * Name: versioned
	 * </p>
	 */
	public static McObfPair field_77141_i = McMappingDatabase.getSRG("field_77141_i");

}
