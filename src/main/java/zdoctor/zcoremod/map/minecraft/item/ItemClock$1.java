package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemClock$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahl$1";
		else
			return "net/minecraft/item/ItemClock$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahl$1";
		else
			return "ItemClock$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahl$1;";
		else
			return "Lnet/minecraft/item/ItemClock$1;";
	}

	/**
	 * <p>
	 * Name: rotation
	 * </p>
	 */
	public static McObfPair field_185088_a = McMappingDatabase.getSRG("field_185088_a");

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)F]
	 * </p>
	 */
	public static McObfPair func_185085_a = McMappingDatabase.getSRG("ItemClock$1.func_185085_a");

	/**
	 * <p>
	 * Name: wobble
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;D)D]
	 * </p>
	 */
	public static McObfPair func_185087_a = McMappingDatabase.getSRG("ItemClock$1.func_185087_a");

	/**
	 * <p>
	 * Name: lastUpdateTick
	 * </p>
	 */
	public static McObfPair field_185090_c = McMappingDatabase.getSRG("field_185090_c");

	/**
	 * <p>
	 * Name: rota
	 * </p>
	 */
	public static McObfPair field_185089_b = McMappingDatabase.getSRG("field_185089_b");

}
