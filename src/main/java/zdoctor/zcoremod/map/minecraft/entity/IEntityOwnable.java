package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IEntityOwnable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vw";
		else
			return "net/minecraft/entity/IEntityOwnable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vw";
		else
			return "IEntityOwnable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvw;";
		else
			return "Lnet/minecraft/entity/IEntityOwnable;";
	}

	/**
	 * <p>
	 * Name: getOwner
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_70902_q = McMappingDatabase.getSRG("IEntityOwnable.func_70902_q");

	/**
	 * <p>
	 * Name: getOwnerId
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_184753_b = McMappingDatabase.getSRG("IEntityOwnable.func_184753_b");

}
