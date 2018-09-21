package zdoctor.zcoremod.map.minecraft.dispenser;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BehaviorProjectileDispense {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nh";
		else
			return "net/minecraft/dispenser/BehaviorProjectileDispense";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nh";
		else
			return "BehaviorProjectileDispense";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnh;";
		else
			return "Lnet/minecraft/dispenser/BehaviorProjectileDispense;";
	}

	/**
	 * <p>
	 * Name: playDispenseSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;)V]
	 * </p>
	 */
	public static McObfPair func_82485_a = McMappingDatabase.getSRG("BehaviorProjectileDispense.func_82485_a");

	/**
	 * <p>
	 * Name: getProjectileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/dispenser/IPosition;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/entity/IProjectile;]
	 * </p>
	 */
	public static McObfPair func_82499_a = McMappingDatabase.getSRG("BehaviorProjectileDispense.func_82499_a");

	/**
	 * <p>
	 * Name: dispenseStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82487_b = McMappingDatabase.getSRG("BehaviorProjectileDispense.func_82487_b");

	/**
	 * <p>
	 * Name: getProjectileVelocity
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_82500_b = McMappingDatabase.getSRG("BehaviorProjectileDispense.func_82500_b");

	/**
	 * <p>
	 * Name: getProjectileInaccuracy
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_82498_a = McMappingDatabase.getSRG("BehaviorProjectileDispense.func_82498_a");

}
