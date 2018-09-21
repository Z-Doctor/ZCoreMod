package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IEntityMultiPart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aba";
		else
			return "net/minecraft/entity/IEntityMultiPart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aba";
		else
			return "IEntityMultiPart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laba;";
		else
			return "Lnet/minecraft/entity/IEntityMultiPart;";
	}

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_82194_d = McMappingDatabase.getSRG("IEntityMultiPart.func_82194_d");

	/**
	 * <p>
	 * Name: attackEntityFromPart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/MultiPartEntityPart;Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70965_a = McMappingDatabase.getSRG("IEntityMultiPart.func_70965_a");

}
