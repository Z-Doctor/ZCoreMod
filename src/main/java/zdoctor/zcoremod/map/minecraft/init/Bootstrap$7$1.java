package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Bootstrap$7$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni$16$1";
		else
			return "net/minecraft/init/Bootstrap$7$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni$16$1";
		else
			return "Bootstrap$7$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lni$16$1;";
		else
			return "Lnet/minecraft/init/Bootstrap$7$1;";
	}

	/**
	 * <p>
	 * Name: getProjectileVelocity
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_82500_b = McMappingDatabase.getSRG("Bootstrap$7$1.func_82500_b");

	/**
	 * <p>
	 * Name: getProjectileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/dispenser/IPosition;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/entity/IProjectile;]
	 * </p>
	 */
	public static McObfPair func_82499_a = McMappingDatabase.getSRG("Bootstrap$7$1.func_82499_a");

	/**
	 * <p>
	 * Name: getProjectileInaccuracy
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_82498_a = McMappingDatabase.getSRG("Bootstrap$7$1.func_82498_a");

}
