package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemDoor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahr";
		else
			return "net/minecraft/item/ItemDoor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahr";
		else
			return "ItemDoor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahr;";
		else
			return "Lnet/minecraft/item/ItemDoor;";
	}

	/**
	 * <p>
	 * Name: placeDoor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/block/Block;Z)V]
	 * </p>
	 */
	public static McObfPair func_179235_a = McMappingDatabase.getSRG("ItemDoor.func_179235_a");

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_179236_a = McMappingDatabase.getSRG("field_179236_a");

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("ItemDoor.func_180614_a");

}
