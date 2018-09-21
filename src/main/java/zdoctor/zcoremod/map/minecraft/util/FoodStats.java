package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FoodStats {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afp";
		else
			return "net/minecraft/util/FoodStats";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afp";
		else
			return "FoodStats";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafp;";
		else
			return "Lnet/minecraft/util/FoodStats;";
	}

	/**
	 * <p>
	 * Name: getSaturationLevel
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_75115_e = McMappingDatabase.getSRG("FoodStats.func_75115_e");

	/**
	 * <p>
	 * Name: addStats
	 * </p>
	 * <p>
	 * Desc: [(IF)V]
	 * </p>
	 */
	public static McObfPair func_75122_a = McMappingDatabase.getSRG("FoodStats.func_75122_a");

	/**
	 * <p>
	 * Name: foodLevel
	 * </p>
	 */
	public static McObfPair field_75127_a = McMappingDatabase.getSRG("field_75127_a");

	/**
	 * <p>
	 * Name: prevFoodLevel
	 * </p>
	 */
	public static McObfPair field_75124_e = McMappingDatabase.getSRG("field_75124_e");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_75118_a = McMappingDatabase.getSRG("FoodStats.func_75118_a");

	/**
	 * <p>
	 * Name: foodExhaustionLevel
	 * </p>
	 */
	public static McObfPair field_75126_c = McMappingDatabase.getSRG("field_75126_c");

	/**
	 * <p>
	 * Name: needFood
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75121_c = McMappingDatabase.getSRG("FoodStats.func_75121_c");

	/**
	 * <p>
	 * Name: foodSaturationLevel
	 * </p>
	 */
	public static McObfPair field_75125_b = McMappingDatabase.getSRG("field_75125_b");

	/**
	 * <p>
	 * Name: foodTimer
	 * </p>
	 */
	public static McObfPair field_75123_d = McMappingDatabase.getSRG("field_75123_d");

	/**
	 * <p>
	 * Name: addExhaustion
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_75113_a = McMappingDatabase.getSRG("FoodStats.func_75113_a");

	/**
	 * <p>
	 * Name: setFoodLevel
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_75114_a = McMappingDatabase.getSRG("FoodStats.func_75114_a");

	/**
	 * <p>
	 * Name: getFoodLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75116_a = McMappingDatabase.getSRG("FoodStats.func_75116_a");

	/**
	 * <p>
	 * Name: readNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_75112_a = McMappingDatabase.getSRG("FoodStats.func_75112_a");

	/**
	 * <p>
	 * Name: addStats
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemFood;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_151686_a = McMappingDatabase.getSRG("FoodStats.func_151686_a");

	/**
	 * <p>
	 * Name: setFoodSaturationLevel
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_75119_b = McMappingDatabase.getSRG("FoodStats.func_75119_b");

	/**
	 * <p>
	 * Name: writeNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_75117_b = McMappingDatabase.getSRG("FoodStats.func_75117_b");

}
