package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DimensionType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayn";
		else
			return "net/minecraft/world/DimensionType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayn";
		else
			return "DimensionType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layn;";
		else
			return "Lnet/minecraft/world/DimensionType;";
	}

	/**
	 * <p>
	 * Name: byName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/world/DimensionType;]
	 * </p>
	 */
	public static McObfPair func_193417_a = McMappingDatabase.getSRG("DimensionType.func_193417_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_186075_e = McMappingDatabase.getSRG("field_186075_e");

	/**
	 * <p>
	 * Name: clazz
	 * </p>
	 */
	public static McObfPair field_186077_g = McMappingDatabase.getSRG("field_186077_g");

	/**
	 * <p>
	 * Name: suffix
	 * </p>
	 */
	public static McObfPair field_186076_f = McMappingDatabase.getSRG("field_186076_f");

	/**
	 * <p>
	 * Name: getSuffix
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_186067_c = McMappingDatabase.getSRG("DimensionType.func_186067_c");

	/**
	 * <p>
	 * Name: createDimension
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldProvider;]
	 * </p>
	 */
	public static McObfPair func_186070_d = McMappingDatabase.getSRG("DimensionType.func_186070_d");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_186065_b = McMappingDatabase.getSRG("DimensionType.func_186065_b");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186068_a = McMappingDatabase.getSRG("DimensionType.func_186068_a");

	/**
	 * <p>
	 * Name: getById
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/world/DimensionType;]
	 * </p>
	 */
	public static McObfPair func_186069_a = McMappingDatabase.getSRG("DimensionType.func_186069_a");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_186074_d = McMappingDatabase.getSRG("field_186074_d");

}
