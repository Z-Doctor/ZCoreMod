package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityShoulderRiding {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aah";
		else
			return "net/minecraft/entity/passive/EntityShoulderRiding";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aah";
		else
			return "EntityShoulderRiding";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laah;";
		else
			return "Lnet/minecraft/entity/passive/EntityShoulderRiding;";
	}

	/**
	 * <p>
	 * Name: setEntityOnShoulder
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_191994_f = McMappingDatabase.getSRG("EntityShoulderRiding.func_191994_f");

	/**
	 * <p>
	 * Name: canSitOnShoulder
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191995_du = McMappingDatabase.getSRG("EntityShoulderRiding.func_191995_du");

	/**
	 * <p>
	 * Name: rideCooldownCounter
	 * </p>
	 */
	public static McObfPair field_191996_bB = McMappingDatabase.getSRG("field_191996_bB");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityShoulderRiding.func_70071_h_");

}
