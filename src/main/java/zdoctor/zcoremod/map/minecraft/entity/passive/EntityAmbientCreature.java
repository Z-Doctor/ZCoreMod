package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAmbientCreature {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zs";
		else
			return "net/minecraft/entity/passive/EntityAmbientCreature";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zs";
		else
			return "EntityAmbientCreature";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzs;";
		else
			return "Lnet/minecraft/entity/passive/EntityAmbientCreature;";
	}

	/**
	 * <p>
	 * Name: canBeLeashedTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_184652_a = McMappingDatabase.getSRG("EntityAmbientCreature.func_184652_a");

}
