package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityLeashKnot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acc";
		else
			return "net/minecraft/entity/EntityLeashKnot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acc";
		else
			return "EntityLeashKnot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacc;";
		else
			return "Lnet/minecraft/entity/EntityLeashKnot;";
	}

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_70107_b = McMappingDatabase.getSRG("EntityLeashKnot.func_70107_b");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityLeashKnot.func_70014_b");

	/**
	 * <p>
	 * Name: onBroken
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_110128_b = McMappingDatabase.getSRG("EntityLeashKnot.func_110128_b");

	/**
	 * <p>
	 * Name: processInitialInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184230_a = McMappingDatabase.getSRG("EntityLeashKnot.func_184230_a");

	/**
	 * <p>
	 * Name: playPlaceSound
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184523_o = McMappingDatabase.getSRG("EntityLeashKnot.func_184523_o");

	/**
	 * <p>
	 * Name: getKnotForPosition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/entity/EntityLeashKnot;]
	 * </p>
	 */
	public static McObfPair func_174863_b = McMappingDatabase.getSRG("EntityLeashKnot.func_174863_b");

	/**
	 * <p>
	 * Name: getHeightPixels
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82330_g = McMappingDatabase.getSRG("EntityLeashKnot.func_82330_g");

	/**
	 * <p>
	 * Name: createKnot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/entity/EntityLeashKnot;]
	 * </p>
	 */
	public static McObfPair func_174862_a = McMappingDatabase.getSRG("EntityLeashKnot.func_174862_a");

	/**
	 * <p>
	 * Name: writeToNBTOptional
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Z]
	 * </p>
	 */
	public static McObfPair func_70039_c = McMappingDatabase.getSRG("EntityLeashKnot.func_70039_c");

	/**
	 * <p>
	 * Name: updateFacingWithBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_174859_a = McMappingDatabase.getSRG("EntityLeashKnot.func_174859_a");

	/**
	 * <p>
	 * Name: updateBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174856_o = McMappingDatabase.getSRG("EntityLeashKnot.func_174856_o");

	/**
	 * <p>
	 * Name: onValidSurface
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70518_d = McMappingDatabase.getSRG("EntityLeashKnot.func_70518_d");

	/**
	 * <p>
	 * Name: getWidthPixels
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82329_d = McMappingDatabase.getSRG("EntityLeashKnot.func_82329_d");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityLeashKnot.func_70047_e");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityLeashKnot.func_70037_a");

	/**
	 * <p>
	 * Name: isInRangeToRenderDist
	 * </p>
	 * <p>
	 * Desc: [(D)Z]
	 * </p>
	 */
	public static McObfPair func_70112_a = McMappingDatabase.getSRG("EntityLeashKnot.func_70112_a");

}
