package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySpider {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adn";
		else
			return "net/minecraft/entity/monster/EntitySpider";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adn";
		else
			return "EntitySpider";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladn;";
		else
			return "Lnet/minecraft/entity/monster/EntitySpider;";
	}

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntitySpider.func_70071_h_");

	/**
	 * <p>
	 * Name: isBesideClimbableBlock
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70841_p = McMappingDatabase.getSRG("EntitySpider.func_70841_p");

	/**
	 * <p>
	 * Name: getMountedYOffset
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70042_X = McMappingDatabase.getSRG("EntitySpider.func_70042_X");

	/**
	 * <p>
	 * Name: CLIMBING
	 * </p>
	 */
	public static McObfPair field_184729_a = McMappingDatabase.getSRG("field_184729_a");

	/**
	 * <p>
	 * Name: playStepSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_180429_a = McMappingDatabase.getSRG("EntitySpider.func_180429_a");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntitySpider.func_70047_e");

	/**
	 * <p>
	 * Name: createNavigator
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)Lnet/minecraft/pathfinding/PathNavigate;]
	 * </p>
	 */
	public static McObfPair func_175447_b = McMappingDatabase.getSRG("EntitySpider.func_175447_b");

	/**
	 * <p>
	 * Name: getCreatureAttribute
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EnumCreatureAttribute;]
	 * </p>
	 */
	public static McObfPair func_70668_bt = McMappingDatabase.getSRG("EntitySpider.func_70668_bt");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntitySpider.func_70088_a");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntitySpider.func_184647_J");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntitySpider.func_184651_r");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntitySpider.func_184615_bR");

	/**
	 * <p>
	 * Name: registerFixesSpider
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189774_d = McMappingDatabase.getSRG("EntitySpider.func_189774_d");

	/**
	 * <p>
	 * Name: isPotionApplicable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;)Z]
	 * </p>
	 */
	public static McObfPair func_70687_e = McMappingDatabase.getSRG("EntitySpider.func_70687_e");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntitySpider.func_110147_ax");

	/**
	 * <p>
	 * Name: setBesideClimbableBlock
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70839_e = McMappingDatabase.getSRG("EntitySpider.func_70839_e");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntitySpider.func_184601_bQ");

	/**
	 * <p>
	 * Name: isOnLadder
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70617_f_ = McMappingDatabase.getSRG("EntitySpider.func_70617_f_");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntitySpider.func_180482_a");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntitySpider.func_184639_G");

	/**
	 * <p>
	 * Name: setInWeb
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70110_aj = McMappingDatabase.getSRG("EntitySpider.func_70110_aj");

}
