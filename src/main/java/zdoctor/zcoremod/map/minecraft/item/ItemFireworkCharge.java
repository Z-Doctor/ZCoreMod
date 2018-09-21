package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemFireworkCharge {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aie";
		else
			return "net/minecraft/item/ItemFireworkCharge";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aie";
		else
			return "ItemFireworkCharge";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laie;";
		else
			return "Lnet/minecraft/item/ItemFireworkCharge;";
	}

	/**
	 * <p>
	 * Name: addInformation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Ljava/util/List;Lnet/minecraft/client/util/ITooltipFlag;)V]
	 * </p>
	 */
	public static McObfPair func_77624_a = McMappingDatabase.getSRG("ItemFireworkCharge.func_77624_a");

	/**
	 * <p>
	 * Name: getExplosionTag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Ljava/lang/String;)Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_150903_a = McMappingDatabase.getSRG("ItemFireworkCharge.func_150903_a");

	/**
	 * <p>
	 * Name: addExplosionInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_150902_a = McMappingDatabase.getSRG("ItemFireworkCharge.func_150902_a");

}
