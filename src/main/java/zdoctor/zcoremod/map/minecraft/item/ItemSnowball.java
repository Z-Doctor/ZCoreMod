package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemSnowball {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aju";
		else
			return "net/minecraft/item/ItemSnowball";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aju";
		else
			return "ItemSnowball";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laju;";
		else
			return "Lnet/minecraft/item/ItemSnowball;";
	}

	/**
	 * <p>
	 * Name: onItemRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;]
	 * </p>
	 */
	public static McObfPair func_77659_a = McMappingDatabase.getSRG("ItemSnowball.func_77659_a");

}
