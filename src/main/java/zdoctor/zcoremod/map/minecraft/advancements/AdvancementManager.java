package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ns";
		else
			return "net/minecraft/advancements/AdvancementManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ns";
		else
			return "AdvancementManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lns;";
		else
			return "Lnet/minecraft/advancements/AdvancementManager;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_192782_a = McMappingDatabase.getSRG("field_192782_a");

	/**
	 * <p>
	 * Name: advancementsDir
	 * </p>
	 */
	public static McObfPair field_192785_d = McMappingDatabase.getSRG("field_192785_d");

	/**
	 * <p>
	 * Name: GSON
	 * </p>
	 */
	public static McObfPair field_192783_b = McMappingDatabase.getSRG("field_192783_b");

	/**
	 * <p>
	 * Name: loadBuiltInAdvancements
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)V]
	 * </p>
	 */
	public static McObfPair func_192777_a = McMappingDatabase.getSRG("AdvancementManager.func_192777_a");

	/**
	 * <p>
	 * Name: ADVANCEMENT_LIST
	 * </p>
	 */
	public static McObfPair field_192784_c = McMappingDatabase.getSRG("field_192784_c");

	/**
	 * <p>
	 * Name: hasErrored
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193767_b = McMappingDatabase.getSRG("AdvancementManager.func_193767_b");

	/**
	 * <p>
	 * Name: loadCustomAdvancements
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_192781_c = McMappingDatabase.getSRG("AdvancementManager.func_192781_c");

	/**
	 * <p>
	 * Name: getAdvancement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/advancements/Advancement;]
	 * </p>
	 */
	public static McObfPair func_192778_a = McMappingDatabase.getSRG("AdvancementManager.func_192778_a");

	/**
	 * <p>
	 * Name: reload
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192779_a = McMappingDatabase.getSRG("AdvancementManager.func_192779_a");

	/**
	 * <p>
	 * Name: getAdvancements
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_192780_b = McMappingDatabase.getSRG("AdvancementManager.func_192780_b");

	/**
	 * <p>
	 * Name: hasErrored
	 * </p>
	 */
	public static McObfPair field_193768_e = McMappingDatabase.getSRG("field_193768_e");

}
