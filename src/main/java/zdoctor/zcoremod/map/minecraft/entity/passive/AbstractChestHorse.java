package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AbstractChestHorse {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aan";
		else
			return "net/minecraft/entity/passive/AbstractChestHorse";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aan";
		else
			return "AbstractChestHorse";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laan;";
		else
			return "Lnet/minecraft/entity/passive/AbstractChestHorse;";
	}

	/**
	 * <p>
	 * Name: playChestEquipSound
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190697_dk = McMappingDatabase.getSRG("AbstractChestHorse.func_190697_dk");

	/**
	 * <p>
	 * Name: registerFixesAbstractChestHorse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;Ljava/lang/Class;)V]
	 * </p>
	 */
	public static McObfPair func_190694_b = McMappingDatabase.getSRG("AbstractChestHorse.func_190694_b");

	/**
	 * <p>
	 * Name: getInventoryColumns
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190696_dl = McMappingDatabase.getSRG("AbstractChestHorse.func_190696_dl");

	/**
	 * <p>
	 * Name: replaceItemInInventory
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_174820_d = McMappingDatabase.getSRG("AbstractChestHorse.func_174820_d");

	/**
	 * <p>
	 * Name: getMountedYOffset
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70042_X = McMappingDatabase.getSRG("AbstractChestHorse.func_70042_X");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("AbstractChestHorse.func_110147_ax");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("AbstractChestHorse.func_70014_b");

	/**
	 * <p>
	 * Name: setChested
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_110207_m = McMappingDatabase.getSRG("AbstractChestHorse.func_110207_m");

	/**
	 * <p>
	 * Name: DATA_ID_CHEST
	 * </p>
	 */
	public static McObfPair field_190698_bG = McMappingDatabase.getSRG("field_190698_bG");

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("AbstractChestHorse.func_184645_a");

	/**
	 * <p>
	 * Name: onDeath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_70645_a = McMappingDatabase.getSRG("AbstractChestHorse.func_70645_a");

	/**
	 * <p>
	 * Name: getInventorySize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190686_di = McMappingDatabase.getSRG("AbstractChestHorse.func_190686_di");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("AbstractChestHorse.func_70088_a");

	/**
	 * <p>
	 * Name: hasChest
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190695_dh = McMappingDatabase.getSRG("AbstractChestHorse.func_190695_dh");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("AbstractChestHorse.func_70037_a");

	/**
	 * <p>
	 * Name: getAngrySound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184785_dv = McMappingDatabase.getSRG("AbstractChestHorse.func_184785_dv");

}
