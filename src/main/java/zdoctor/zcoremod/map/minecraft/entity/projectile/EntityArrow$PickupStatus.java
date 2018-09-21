package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityArrow$PickupStatus {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeh$a";
		else
			return "net/minecraft/entity/projectile/EntityArrow$PickupStatus";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aeh$a";
		else
			return "EntityArrow$PickupStatus";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laeh$a;";
		else
			return "Lnet/minecraft/entity/projectile/EntityArrow$PickupStatus;";
	}

	/**
	 * <p>
	 * Name: getByOrdinal
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/projectile/EntityArrow$PickupStatus;]
	 * </p>
	 */
	public static McObfPair func_188795_a = McMappingDatabase.getSRG("EntityArrow$PickupStatus.func_188795_a");

}
