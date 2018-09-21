package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEvoker {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acx";
		else
			return "net/minecraft/entity/monster/EntityEvoker";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acx";
		else
			return "EntityEvoker";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacx;";
		else
			return "Lnet/minecraft/entity/monster/EntityEvoker;";
	}

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityEvoker.func_110147_ax");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntityEvoker.func_70619_bc");

	/**
	 * <p>
	 * Name: setWololoTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntitySheep;)V]
	 * </p>
	 */
	public static McObfPair func_190748_a = McMappingDatabase.getSRG("EntityEvoker.func_190748_a");

	/**
	 * <p>
	 * Name: isOnSameTeam
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_184191_r = McMappingDatabase.getSRG("EntityEvoker.func_184191_r");

	/**
	 * <p>
	 * Name: getWololoTarget
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/passive/EntitySheep;]
	 * </p>
	 */
	public static McObfPair func_190751_dj = McMappingDatabase.getSRG("EntityEvoker.func_190751_dj");

	/**
	 * <p>
	 * Name: wololoTarget
	 * </p>
	 */
	public static McObfPair field_190763_bw = McMappingDatabase.getSRG("field_190763_bw");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityEvoker.func_70071_h_");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityEvoker.func_184639_G");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityEvoker.func_184647_J");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityEvoker.func_70088_a");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityEvoker.func_184615_bR");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityEvoker.func_70037_a");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityEvoker.func_184651_r");

	/**
	 * <p>
	 * Name: getSpellSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_193086_dk = McMappingDatabase.getSRG("EntityEvoker.func_193086_dk");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityEvoker.func_70014_b");

	/**
	 * <p>
	 * Name: registerFixesEvoker
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_190759_b = McMappingDatabase.getSRG("EntityEvoker.func_190759_b");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityEvoker.func_184601_bQ");

}
