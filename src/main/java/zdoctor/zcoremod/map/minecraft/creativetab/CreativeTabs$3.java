package zdoctor.zcoremod.map.minecraft.creativetab;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CreativeTabs$3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahp$6";
		else
			return "net/minecraft/creativetab/CreativeTabs$3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahp$6";
		else
			return "CreativeTabs$3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahp$6;";
		else
			return "Lnet/minecraft/creativetab/CreativeTabs$3;";
	}

	/**
	 * <p>
	 * Name: getTabIconItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_78016_d = McMappingDatabase.getSRG("CreativeTabs$3.func_78016_d");

}
