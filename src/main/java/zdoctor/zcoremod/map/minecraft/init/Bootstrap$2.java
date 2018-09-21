package zdoctor.zcoremod.map.minecraft.init;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Bootstrap$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni$11";
		else
			return "net/minecraft/init/Bootstrap$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ni$11";
		else
			return "Bootstrap$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lni$11;";
		else
			return "Lnet/minecraft/init/Bootstrap$2;";
	}

	/**
	 * <p>
	 * Name: getProjectileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/dispenser/IPosition;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/entity/IProjectile;]
	 * </p>
	 */
	public static McObfPair func_82499_a = McMappingDatabase.getSRG("Bootstrap$2.func_82499_a");

}
