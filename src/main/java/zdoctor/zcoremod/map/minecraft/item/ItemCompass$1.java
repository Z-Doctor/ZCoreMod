package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemCompass$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahn$1";
		else
			return "net/minecraft/item/ItemCompass$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahn$1";
		else
			return "ItemCompass$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahn$1;";
		else
			return "Lnet/minecraft/item/ItemCompass$1;";
	}

	/**
	 * <p>
	 * Name: wobble
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;D)D]
	 * </p>
	 */
	public static McObfPair func_185093_a = McMappingDatabase.getSRG("ItemCompass$1.func_185093_a");

	/**
	 * <p>
	 * Name: rota
	 * </p>
	 */
	public static McObfPair field_185096_b = McMappingDatabase.getSRG("field_185096_b");

	/**
	 * <p>
	 * Name: getFrameRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItemFrame;)D]
	 * </p>
	 */
	public static McObfPair func_185094_a = McMappingDatabase.getSRG("ItemCompass$1.func_185094_a");

	/**
	 * <p>
	 * Name: getSpawnToAngle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)D]
	 * </p>
	 */
	public static McObfPair func_185092_a = McMappingDatabase.getSRG("ItemCompass$1.func_185092_a");

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)F]
	 * </p>
	 */
	public static McObfPair func_185085_a = McMappingDatabase.getSRG("ItemCompass$1.func_185085_a");

	/**
	 * <p>
	 * Name: lastUpdateTick
	 * </p>
	 */
	public static McObfPair field_185097_c = McMappingDatabase.getSRG("field_185097_c");

	/**
	 * <p>
	 * Name: rotation
	 * </p>
	 */
	public static McObfPair field_185095_a = McMappingDatabase.getSRG("field_185095_a");

}
