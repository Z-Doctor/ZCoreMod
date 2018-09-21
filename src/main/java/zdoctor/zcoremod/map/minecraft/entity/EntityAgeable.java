package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAgeable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vd";
		else
			return "net/minecraft/entity/EntityAgeable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vd";
		else
			return "EntityAgeable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvd;";
		else
			return "Lnet/minecraft/entity/EntityAgeable;";
	}

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("EntityAgeable.func_184645_a");

	/**
	 * <p>
	 * Name: setGrowingAge
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70873_a = McMappingDatabase.getSRG("EntityAgeable.func_70873_a");

	/**
	 * <p>
	 * Name: growingAge
	 * </p>
	 */
	public static McObfPair field_175504_a = McMappingDatabase.getSRG("field_175504_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityAgeable.func_70014_b");

	/**
	 * <p>
	 * Name: setSize
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_70105_a = McMappingDatabase.getSRG("EntityAgeable.func_70105_a");

	/**
	 * <p>
	 * Name: ageUp
	 * </p>
	 * <p>
	 * Desc: [(IZ)V]
	 * </p>
	 */
	public static McObfPair func_175501_a = McMappingDatabase.getSRG("EntityAgeable.func_175501_a");

	/**
	 * <p>
	 * Name: holdingSpawnEggOfClass
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)Z]
	 * </p>
	 */
	public static McObfPair func_190669_a = McMappingDatabase.getSRG("EntityAgeable.func_190669_a");

	/**
	 * <p>
	 * Name: addGrowth
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_110195_a = McMappingDatabase.getSRG("EntityAgeable.func_110195_a");

	/**
	 * <p>
	 * Name: ageHeight
	 * </p>
	 */
	public static McObfPair field_98057_e = McMappingDatabase.getSRG("field_98057_e");

	/**
	 * <p>
	 * Name: BABY
	 * </p>
	 */
	public static McObfPair field_184751_bv = McMappingDatabase.getSRG("field_184751_bv");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityAgeable.func_70088_a");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityAgeable.func_70636_d");

	/**
	 * <p>
	 * Name: getGrowingAge
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70874_b = McMappingDatabase.getSRG("EntityAgeable.func_70874_b");

	/**
	 * <p>
	 * Name: forcedAge
	 * </p>
	 */
	public static McObfPair field_175502_b = McMappingDatabase.getSRG("field_175502_b");

	/**
	 * <p>
	 * Name: setScale
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_98055_j = McMappingDatabase.getSRG("EntityAgeable.func_98055_j");

	/**
	 * <p>
	 * Name: createChild
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;]
	 * </p>
	 */
	public static McObfPair func_90011_a = McMappingDatabase.getSRG("EntityAgeable.func_90011_a");

	/**
	 * <p>
	 * Name: setScaleForAge
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_98054_a = McMappingDatabase.getSRG("EntityAgeable.func_98054_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityAgeable.func_70037_a");

	/**
	 * <p>
	 * Name: isChild
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70631_g_ = McMappingDatabase.getSRG("EntityAgeable.func_70631_g_");

	/**
	 * <p>
	 * Name: onGrowingAdult
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175500_n = McMappingDatabase.getSRG("EntityAgeable.func_175500_n");

	/**
	 * <p>
	 * Name: ageWidth
	 * </p>
	 */
	public static McObfPair field_98056_d = McMappingDatabase.getSRG("field_98056_d");

	/**
	 * <p>
	 * Name: forcedAgeTimer
	 * </p>
	 */
	public static McObfPair field_175503_c = McMappingDatabase.getSRG("field_175503_c");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityAgeable.func_184206_a");

}
