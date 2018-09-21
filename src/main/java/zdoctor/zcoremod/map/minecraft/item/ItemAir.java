package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemAir {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agt";
		else
			return "net/minecraft/item/ItemAir";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agt";
		else
			return "ItemAir";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagt;";
		else
			return "Lnet/minecraft/item/ItemAir;";
	}

	/**
	 * <p>
	 * Name: addInformation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Ljava/util/List;Lnet/minecraft/client/util/ITooltipFlag;)V]
	 * </p>
	 */
	public static McObfPair func_77624_a = McMappingDatabase.getSRG("ItemAir.func_77624_a");

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_190904_a = McMappingDatabase.getSRG("field_190904_a");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77658_a = McMappingDatabase.getSRG("ItemAir.func_77658_a");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77667_c = McMappingDatabase.getSRG("ItemAir.func_77667_c");

}
