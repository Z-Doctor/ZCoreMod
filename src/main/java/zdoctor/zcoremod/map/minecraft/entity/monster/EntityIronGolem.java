package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityIronGolem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aak";
		else
			return "net/minecraft/entity/monster/EntityIronGolem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aak";
		else
			return "EntityIronGolem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laak;";
		else
			return "Lnet/minecraft/entity/monster/EntityIronGolem;";
	}

	/**
	 * <p>
	 * Name: playStepSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_180429_a = McMappingDatabase.getSRG("EntityIronGolem.func_180429_a");

	/**
	 * <p>
	 * Name: collideWithEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_82167_n = McMappingDatabase.getSRG("EntityIronGolem.func_82167_n");

	/**
	 * <p>
	 * Name: attackEntityAsMob
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_70652_k = McMappingDatabase.getSRG("EntityIronGolem.func_70652_k");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityIronGolem.func_110147_ax");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityIronGolem.func_184615_bR");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityIronGolem.func_184651_r");

	/**
	 * <p>
	 * Name: holdRoseTick
	 * </p>
	 */
	public static McObfPair field_70856_g = McMappingDatabase.getSRG("field_70856_g");

	/**
	 * <p>
	 * Name: decreaseAirSupply
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_70682_h = McMappingDatabase.getSRG("EntityIronGolem.func_70682_h");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityIronGolem.func_184647_J");

	/**
	 * <p>
	 * Name: setPlayerCreated
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70849_f = McMappingDatabase.getSRG("EntityIronGolem.func_70849_f");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityIronGolem.func_184601_bQ");

	/**
	 * <p>
	 * Name: attackTimer
	 * </p>
	 */
	public static McObfPair field_70855_f = McMappingDatabase.getSRG("field_70855_f");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityIronGolem.func_70037_a");

	/**
	 * <p>
	 * Name: getVillage
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/village/Village;]
	 * </p>
	 */
	public static McObfPair func_70852_n = McMappingDatabase.getSRG("EntityIronGolem.func_70852_n");

	/**
	 * <p>
	 * Name: village
	 * </p>
	 */
	public static McObfPair field_70857_d = McMappingDatabase.getSRG("field_70857_d");

	/**
	 * <p>
	 * Name: isPlayerCreated
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70850_q = McMappingDatabase.getSRG("EntityIronGolem.func_70850_q");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityIronGolem.func_70014_b");

	/**
	 * <p>
	 * Name: registerFixesIronGolem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189784_b = McMappingDatabase.getSRG("EntityIronGolem.func_189784_b");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityIronGolem.func_70103_a");

	/**
	 * <p>
	 * Name: PLAYER_CREATED
	 * </p>
	 */
	public static McObfPair field_184750_a = McMappingDatabase.getSRG("field_184750_a");

	/**
	 * <p>
	 * Name: setHoldingRose
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70851_e = McMappingDatabase.getSRG("EntityIronGolem.func_70851_e");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityIronGolem.func_70088_a");

	/**
	 * <p>
	 * Name: canAttackClass
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;)Z]
	 * </p>
	 */
	public static McObfPair func_70686_a = McMappingDatabase.getSRG("EntityIronGolem.func_70686_a");

	/**
	 * <p>
	 * Name: getAttackTimer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70854_o = McMappingDatabase.getSRG("EntityIronGolem.func_70854_o");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntityIronGolem.func_70619_bc");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityIronGolem.func_70636_d");

	/**
	 * <p>
	 * Name: onDeath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_70645_a = McMappingDatabase.getSRG("EntityIronGolem.func_70645_a");

	/**
	 * <p>
	 * Name: getHoldRoseTick
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70853_p = McMappingDatabase.getSRG("EntityIronGolem.func_70853_p");

	/**
	 * <p>
	 * Name: homeCheckTimer
	 * </p>
	 */
	public static McObfPair field_70858_e = McMappingDatabase.getSRG("field_70858_e");

}
