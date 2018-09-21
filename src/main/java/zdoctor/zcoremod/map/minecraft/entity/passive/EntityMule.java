package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMule {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aat";
		else
			return "net/minecraft/entity/passive/EntityMule";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aat";
		else
			return "EntityMule";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laat;";
		else
			return "Lnet/minecraft/entity/passive/EntityMule;";
	}

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityMule.func_184615_bR");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityMule.func_184647_J");

	/**
	 * <p>
	 * Name: registerFixesMule
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_190700_b = McMappingDatabase.getSRG("EntityMule.func_190700_b");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityMule.func_184601_bQ");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityMule.func_184639_G");

	/**
	 * <p>
	 * Name: playChestEquipSound
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190697_dk = McMappingDatabase.getSRG("EntityMule.func_190697_dk");

}
