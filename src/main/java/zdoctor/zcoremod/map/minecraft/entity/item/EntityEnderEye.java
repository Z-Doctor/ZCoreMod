package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEnderEye {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aek";
		else
			return "net/minecraft/entity/item/EntityEnderEye";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aek";
		else
			return "EntityEnderEye";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laek;";
		else
			return "Lnet/minecraft/entity/item/EntityEnderEye;";
	}

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70070_b = McMappingDatabase.getSRG("EntityEnderEye.func_70070_b");

	/**
	 * <p>
	 * Name: setVelocity
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70016_h = McMappingDatabase.getSRG("EntityEnderEye.func_70016_h");

	/**
	 * <p>
	 * Name: targetY
	 * </p>
	 */
	public static McObfPair field_70225_c = McMappingDatabase.getSRG("field_70225_c");

	/**
	 * <p>
	 * Name: targetZ
	 * </p>
	 */
	public static McObfPair field_70222_d = McMappingDatabase.getSRG("field_70222_d");

	/**
	 * <p>
	 * Name: getBrightness
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70013_c = McMappingDatabase.getSRG("EntityEnderEye.func_70013_c");

	/**
	 * <p>
	 * Name: shatterOrDrop
	 * </p>
	 */
	public static McObfPair field_70221_f = McMappingDatabase.getSRG("field_70221_f");

	/**
	 * <p>
	 * Name: despawnTimer
	 * </p>
	 */
	public static McObfPair field_70223_e = McMappingDatabase.getSRG("field_70223_e");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityEnderEye.func_70071_h_");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityEnderEye.func_70037_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityEnderEye.func_70088_a");

	/**
	 * <p>
	 * Name: moveTowards
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180465_a = McMappingDatabase.getSRG("EntityEnderEye.func_180465_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityEnderEye.func_70014_b");

	/**
	 * <p>
	 * Name: targetX
	 * </p>
	 */
	public static McObfPair field_70224_b = McMappingDatabase.getSRG("field_70224_b");

	/**
	 * <p>
	 * Name: isInRangeToRenderDist
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_70112_a = McMappingDatabase.getSRG("EntityEnderEye.func_70112_a");

	/**
	 * <p>
	 * Name: canBeAttackedWithItem
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70075_an = McMappingDatabase.getSRG("EntityEnderEye.func_70075_an");

}
