package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityFireworkRocket {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aem";
		else
			return "net/minecraft/entity/item/EntityFireworkRocket";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aem";
		else
			return "EntityFireworkRocket";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laem;";
		else
			return "Lnet/minecraft/entity/item/EntityFireworkRocket;";
	}

	/**
	 * <p>
	 * Name: dealExplosionDamage
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_191510_k = McMappingDatabase.getSRG("EntityFireworkRocket.func_191510_k");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityFireworkRocket.func_70014_b");

	/**
	 * <p>
	 * Name: isAttachedToEntity
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191511_j = McMappingDatabase.getSRG("EntityFireworkRocket.func_191511_j");

	/**
	 * <p>
	 * Name: boostedEntity
	 * </p>
	 */
	public static McObfPair field_191513_e = McMappingDatabase.getSRG("field_191513_e");

	/**
	 * <p>
	 * Name: canBeAttackedWithItem
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70075_an = McMappingDatabase.getSRG("EntityFireworkRocket.func_70075_an");

	/**
	 * <p>
	 * Name: FIREWORK_ITEM
	 * </p>
	 */
	public static McObfPair field_184566_a = McMappingDatabase.getSRG("field_184566_a");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityFireworkRocket.func_70103_a");

	/**
	 * <p>
	 * Name: isInRangeToRenderDist
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_70112_a = McMappingDatabase.getSRG("EntityFireworkRocket.func_70112_a");

	/**
	 * <p>
	 * Name: lifetime
	 * </p>
	 */
	public static McObfPair field_92055_b = McMappingDatabase.getSRG("field_92055_b");

	/**
	 * <p>
	 * Name: isInRangeToRender3d
	 * </p>
	 * <p>
	 * Desc: [(DDD)Z]
	 * </p>
	 */
	public static McObfPair func_145770_h = McMappingDatabase.getSRG("EntityFireworkRocket.func_145770_h");

	/**
	 * <p>
	 * Name: BOOSTED_ENTITY_ID
	 * </p>
	 */
	public static McObfPair field_191512_b = McMappingDatabase.getSRG("field_191512_b");

	/**
	 * <p>
	 * Name: registerFixesFireworkRocket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189656_a = McMappingDatabase.getSRG("EntityFireworkRocket.func_189656_a");

	/**
	 * <p>
	 * Name: fireworkAge
	 * </p>
	 */
	public static McObfPair field_92056_a = McMappingDatabase.getSRG("field_92056_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityFireworkRocket.func_70037_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityFireworkRocket.func_70088_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityFireworkRocket.func_70071_h_");

	/**
	 * <p>
	 * Name: setVelocity
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70016_h = McMappingDatabase.getSRG("EntityFireworkRocket.func_70016_h");

}
