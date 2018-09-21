package zdoctor.zcoremod.map.minecraft.creativetab;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CreativeTabs$11 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahp$3";
		else
			return "net/minecraft/creativetab/CreativeTabs$11";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahp$3";
		else
			return "CreativeTabs$11";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahp$3;";
		else
			return "Lnet/minecraft/creativetab/CreativeTabs$11;";
	}

	/**
	 * <p>
	 * Name: isAlignedRight
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192394_m = McMappingDatabase.getSRG("CreativeTabs$11.func_192394_m");

	/**
	 * <p>
	 * Name: displayAllRelevantItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_78018_a = McMappingDatabase.getSRG("CreativeTabs$11.func_78018_a");

	/**
	 * <p>
	 * Name: getTabIconItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_78016_d = McMappingDatabase.getSRG("CreativeTabs$11.func_78016_d");

}
