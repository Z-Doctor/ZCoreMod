package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class InventoryChangeTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "al$b";
		else
			return "net/minecraft/advancements/critereon/InventoryChangeTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "al$b";
		else
			return "InventoryChangeTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lal$b;";
		else
			return "Lnet/minecraft/advancements/critereon/InventoryChangeTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_192265_a = McMappingDatabase.getSRG("InventoryChangeTrigger$Instance.func_192265_a");

	/**
	 * <p>
	 * Name: empty
	 * </p>
	 */
	public static McObfPair field_192268_c = McMappingDatabase.getSRG("field_192268_c");

	/**
	 * <p>
	 * Name: occupied
	 * </p>
	 */
	public static McObfPair field_192266_a = McMappingDatabase.getSRG("field_192266_a");

	/**
	 * <p>
	 * Name: items
	 * </p>
	 */
	public static McObfPair field_192269_d = McMappingDatabase.getSRG("field_192269_d");

	/**
	 * <p>
	 * Name: full
	 * </p>
	 */
	public static McObfPair field_192267_b = McMappingDatabase.getSRG("field_192267_b");

}
