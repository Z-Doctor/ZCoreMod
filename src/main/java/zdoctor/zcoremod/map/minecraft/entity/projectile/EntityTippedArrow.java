package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityTippedArrow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afa";
		else
			return "net/minecraft/entity/projectile/EntityTippedArrow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afa";
		else
			return "EntityTippedArrow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafa;";
		else
			return "Lnet/minecraft/entity/projectile/EntityTippedArrow;";
	}

	/**
	 * <p>
	 * Name: setPotionEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_184555_a = McMappingDatabase.getSRG("EntityTippedArrow.func_184555_a");

	/**
	 * <p>
	 * Name: customPotionEffects
	 * </p>
	 */
	public static McObfPair field_184561_h = McMappingDatabase.getSRG("field_184561_h");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityTippedArrow.func_70037_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityTippedArrow.func_70088_a");

	/**
	 * <p>
	 * Name: addEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;)V]
	 * </p>
	 */
	public static McObfPair func_184558_a = McMappingDatabase.getSRG("EntityTippedArrow.func_184558_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityTippedArrow.func_70014_b");

	/**
	 * <p>
	 * Name: setFixedColor
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_191507_d = McMappingDatabase.getSRG("EntityTippedArrow.func_191507_d");

	/**
	 * <p>
	 * Name: spawnPotionParticles
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_184556_b = McMappingDatabase.getSRG("EntityTippedArrow.func_184556_b");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityTippedArrow.func_70071_h_");

	/**
	 * <p>
	 * Name: registerFixesTippedArrow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189660_b = McMappingDatabase.getSRG("EntityTippedArrow.func_189660_b");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityTippedArrow.func_70103_a");

	/**
	 * <p>
	 * Name: fixedColor
	 * </p>
	 */
	public static McObfPair field_191509_at = McMappingDatabase.getSRG("field_191509_at");

	/**
	 * <p>
	 * Name: getCustomColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_191508_b = McMappingDatabase.getSRG("EntityTippedArrow.func_191508_b");

	/**
	 * <p>
	 * Name: getArrowStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184550_j = McMappingDatabase.getSRG("EntityTippedArrow.func_184550_j");

	/**
	 * <p>
	 * Name: COLOR
	 * </p>
	 */
	public static McObfPair field_184559_f = McMappingDatabase.getSRG("field_184559_f");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184557_n = McMappingDatabase.getSRG("EntityTippedArrow.func_184557_n");

	/**
	 * <p>
	 * Name: arrowHit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_184548_a = McMappingDatabase.getSRG("EntityTippedArrow.func_184548_a");

	/**
	 * <p>
	 * Name: potion
	 * </p>
	 */
	public static McObfPair field_184560_g = McMappingDatabase.getSRG("field_184560_g");

	/**
	 * <p>
	 * Name: refreshColor
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190548_o = McMappingDatabase.getSRG("EntityTippedArrow.func_190548_o");

}
