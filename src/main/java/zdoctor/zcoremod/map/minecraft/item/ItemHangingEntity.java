package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemHangingEntity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ail";
		else
			return "net/minecraft/item/ItemHangingEntity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ail";
		else
			return "ItemHangingEntity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lail;";
		else
			return "Lnet/minecraft/item/ItemHangingEntity;";
	}

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("ItemHangingEntity.func_180614_a");

	/**
	 * <p>
	 * Name: hangingEntityClass
	 * </p>
	 */
	public static McObfPair field_82811_a = McMappingDatabase.getSRG("field_82811_a");

	/**
	 * <p>
	 * Name: createEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/entity/EntityHanging;]
	 * </p>
	 */
	public static McObfPair func_179233_a = McMappingDatabase.getSRG("ItemHangingEntity.func_179233_a");

}
