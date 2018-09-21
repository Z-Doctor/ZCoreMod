package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPotion {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aez";
		else
			return "net/minecraft/entity/projectile/EntityPotion";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aez";
		else
			return "EntityPotion";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laez;";
		else
			return "Lnet/minecraft/entity/projectile/EntityPotion;";
	}

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityPotion.func_70037_a");

	/**
	 * <p>
	 * Name: setItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_184541_a = McMappingDatabase.getSRG("EntityPotion.func_184541_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_184546_e = McMappingDatabase.getSRG("field_184546_e");

	/**
	 * <p>
	 * Name: isLingering
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184544_n = McMappingDatabase.getSRG("EntityPotion.func_184544_n");

	/**
	 * <p>
	 * Name: makeAreaOfEffectCloud
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/potion/PotionType;)V]
	 * </p>
	 */
	public static McObfPair func_190542_a = McMappingDatabase.getSRG("EntityPotion.func_190542_a");

	/**
	 * <p>
	 * Name: applySplash
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_190543_a = McMappingDatabase.getSRG("EntityPotion.func_190543_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityPotion.func_70014_b");

	/**
	 * <p>
	 * Name: isWaterSensitiveEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_190544_c = McMappingDatabase.getSRG("EntityPotion.func_190544_c");

	/**
	 * <p>
	 * Name: onImpact
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_70184_a = McMappingDatabase.getSRG("EntityPotion.func_70184_a");

	/**
	 * <p>
	 * Name: getGravityVelocity
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70185_h = McMappingDatabase.getSRG("EntityPotion.func_70185_h");

	/**
	 * <p>
	 * Name: registerFixesPotion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189665_a = McMappingDatabase.getSRG("EntityPotion.func_189665_a");

	/**
	 * <p>
	 * Name: applyWater
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190545_n = McMappingDatabase.getSRG("EntityPotion.func_190545_n");

	/**
	 * <p>
	 * Name: getPotion
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184543_l = McMappingDatabase.getSRG("EntityPotion.func_184543_l");

	/**
	 * <p>
	 * Name: ITEM
	 * </p>
	 */
	public static McObfPair field_184545_d = McMappingDatabase.getSRG("field_184545_d");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityPotion.func_70088_a");

	/**
	 * <p>
	 * Name: WATER_SENSITIVE
	 * </p>
	 */
	public static McObfPair field_190546_d = McMappingDatabase.getSRG("field_190546_d");

	/**
	 * <p>
	 * Name: extinguishFires
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_184542_a = McMappingDatabase.getSRG("EntityPotion.func_184542_a");

}
