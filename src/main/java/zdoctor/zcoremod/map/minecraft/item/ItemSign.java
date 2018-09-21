package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemSign {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajp";
		else
			return "net/minecraft/item/ItemSign";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajp";
		else
			return "ItemSign";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lajp;";
		else
			return "Lnet/minecraft/item/ItemSign;";
	}

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("ItemSign.func_180614_a");

}
