package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ObjectIntIdentityMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fd";
		else
			return "net/minecraft/util/ObjectIntIdentityMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fd";
		else
			return "ObjectIntIdentityMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfd;";
		else
			return "Lnet/minecraft/util/ObjectIntIdentityMap;";
	}

	/**
	 * <p>
	 * Name: objectList
	 * </p>
	 */
	public static McObfPair field_148748_b = McMappingDatabase.getSRG("field_148748_b");

	/**
	 * <p>
	 * Name: identityMap
	 * </p>
	 */
	public static McObfPair field_148749_a = McMappingDatabase.getSRG("field_148749_a");

	/**
	 * <p>
	 * Name: put
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;I)V]
	 * </p>
	 */
	public static McObfPair func_148746_a = McMappingDatabase.getSRG("ObjectIntIdentityMap.func_148746_a");

	/**
	 * <p>
	 * Name: get
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)I]
	 * </p>
	 */
	public static McObfPair func_148747_b = McMappingDatabase.getSRG("ObjectIntIdentityMap.func_148747_b");

	/**
	 * <p>
	 * Name: size
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186804_a = McMappingDatabase.getSRG("ObjectIntIdentityMap.func_186804_a");

	/**
	 * <p>
	 * Name: getByValue
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_148745_a = McMappingDatabase.getSRG("ObjectIntIdentityMap.func_148745_a");

}
