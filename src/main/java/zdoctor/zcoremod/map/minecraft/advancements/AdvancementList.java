package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "j";
		else
			return "net/minecraft/advancements/AdvancementList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "j";
		else
			return "AdvancementList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lj;";
		else
			return "Lnet/minecraft/advancements/AdvancementList;";
	}

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_192090_a = McMappingDatabase.getSRG("AdvancementList.func_192090_a");

	/**
	 * <p>
	 * Name: listener
	 * </p>
	 */
	public static McObfPair field_192095_e = McMappingDatabase.getSRG("field_192095_e");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192087_a = McMappingDatabase.getSRG("AdvancementList.func_192087_a");

	/**
	 * <p>
	 * Name: loadAdvancements
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)V]
	 * </p>
	 */
	public static McObfPair func_192083_a = McMappingDatabase.getSRG("AdvancementList.func_192083_a");

	/**
	 * <p>
	 * Name: getRoots
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_192088_b = McMappingDatabase.getSRG("AdvancementList.func_192088_b");

	/**
	 * <p>
	 * Name: getAdvancements
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_192089_c = McMappingDatabase.getSRG("AdvancementList.func_192089_c");

	/**
	 * <p>
	 * Name: nonRoots
	 * </p>
	 */
	public static McObfPair field_192094_d = McMappingDatabase.getSRG("field_192094_d");

	/**
	 * <p>
	 * Name: getAdvancement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/advancements/Advancement;]
	 * </p>
	 */
	public static McObfPair func_192084_a = McMappingDatabase.getSRG("AdvancementList.func_192084_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_192091_a = McMappingDatabase.getSRG("field_192091_a");

	/**
	 * <p>
	 * Name: setListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/AdvancementList$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192086_a = McMappingDatabase.getSRG("AdvancementList.func_192086_a");

	/**
	 * <p>
	 * Name: advancements
	 * </p>
	 */
	public static McObfPair field_192092_b = McMappingDatabase.getSRG("field_192092_b");

	/**
	 * <p>
	 * Name: removeAll
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Set;)V]
	 * </p>
	 */
	public static McObfPair func_192085_a = McMappingDatabase.getSRG("AdvancementList.func_192085_a");

	/**
	 * <p>
	 * Name: roots
	 * </p>
	 */
	public static McObfPair field_192093_c = McMappingDatabase.getSRG("field_192093_c");

}
