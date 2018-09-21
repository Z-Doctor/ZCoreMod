package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IProjectile {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aep";
		else
			return "net/minecraft/entity/IProjectile";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aep";
		else
			return "IProjectile";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laep;";
		else
			return "Lnet/minecraft/entity/IProjectile;";
	}

	/**
	 * <p>
	 * Name: shoot
	 * </p>
	 * <p>
	 * Desc: [(DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_70186_c = McMappingDatabase.getSRG("IProjectile.func_70186_c");

}
