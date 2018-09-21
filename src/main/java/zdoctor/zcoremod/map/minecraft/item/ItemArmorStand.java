package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemArmorStand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agw";
		else
			return "net/minecraft/item/ItemArmorStand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agw";
		else
			return "ItemArmorStand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagw;";
		else
			return "Lnet/minecraft/item/ItemArmorStand;";
	}

	/**
	 * <p>
	 * Name: applyRandomRotations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityArmorStand;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_179221_a = McMappingDatabase.getSRG("ItemArmorStand.func_179221_a");

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("ItemArmorStand.func_180614_a");

}
