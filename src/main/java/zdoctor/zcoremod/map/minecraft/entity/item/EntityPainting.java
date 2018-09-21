package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPainting {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acd";
		else
			return "net/minecraft/entity/item/EntityPainting";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acd";
		else
			return "EntityPainting";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacd;";
		else
			return "Lnet/minecraft/entity/item/EntityPainting;";
	}

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityPainting.func_70037_a");

	/**
	 * <p>
	 * Name: art
	 * </p>
	 */
	public static McObfPair field_70522_e = McMappingDatabase.getSRG("field_70522_e");

	/**
	 * <p>
	 * Name: setPositionAndRotationDirect
	 * </p>
	 * <p>
	 * Desc: [(DDDFFIZ)V]
	 * </p>
	 */
	public static McObfPair func_180426_a = McMappingDatabase.getSRG("EntityPainting.func_180426_a");

	/**
	 * <p>
	 * Name: getHeightPixels
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82330_g = McMappingDatabase.getSRG("EntityPainting.func_82330_g");

	/**
	 * <p>
	 * Name: onBroken
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_110128_b = McMappingDatabase.getSRG("EntityPainting.func_110128_b");

	/**
	 * <p>
	 * Name: playPlaceSound
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184523_o = McMappingDatabase.getSRG("EntityPainting.func_184523_o");

	/**
	 * <p>
	 * Name: getWidthPixels
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82329_d = McMappingDatabase.getSRG("EntityPainting.func_82329_d");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityPainting.func_70014_b");

	/**
	 * <p>
	 * Name: setLocationAndAngles
	 * </p>
	 * <p>
	 * Desc: [(DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_70012_b = McMappingDatabase.getSRG("EntityPainting.func_70012_b");

}
