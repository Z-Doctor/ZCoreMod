package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aiw";
		else
			return "net/minecraft/item/ItemMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aiw";
		else
			return "ItemMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laiw;";
		else
			return "Lnet/minecraft/item/ItemMap;";
	}

	/**
	 * <p>
	 * Name: getMapData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;)Lnet/minecraft/world/storage/MapData;]
	 * </p>
	 */
	public static McObfPair func_77873_a = McMappingDatabase.getSRG("ItemMap.func_77873_a");

	/**
	 * <p>
	 * Name: renderBiomePreviewMap
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_190905_a = McMappingDatabase.getSRG("ItemMap.func_190905_a");

	/**
	 * <p>
	 * Name: loadMapData
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/world/World;)Lnet/minecraft/world/storage/MapData;]
	 * </p>
	 */
	public static McObfPair func_150912_a = McMappingDatabase.getSRG("ItemMap.func_150912_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;IZ)V]
	 * </p>
	 */
	public static McObfPair func_77663_a = McMappingDatabase.getSRG("ItemMap.func_77663_a");

	/**
	 * <p>
	 * Name: scaleMap
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;I)V]
	 * </p>
	 */
	public static McObfPair func_185063_a = McMappingDatabase.getSRG("ItemMap.func_185063_a");

	/**
	 * <p>
	 * Name: addInformation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Ljava/util/List;Lnet/minecraft/client/util/ITooltipFlag;)V]
	 * </p>
	 */
	public static McObfPair func_77624_a = McMappingDatabase.getSRG("ItemMap.func_77624_a");

	/**
	 * <p>
	 * Name: enableMapTracking
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_185064_b = McMappingDatabase.getSRG("ItemMap.func_185064_b");

	/**
	 * <p>
	 * Name: setupNewMap
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;DDBZZ)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190906_a = McMappingDatabase.getSRG("ItemMap.func_190906_a");

	/**
	 * <p>
	 * Name: updateMapData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;Lnet/minecraft/world/storage/MapData;)V]
	 * </p>
	 */
	public static McObfPair func_77872_a = McMappingDatabase.getSRG("ItemMap.func_77872_a");

	/**
	 * <p>
	 * Name: createMapDataPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/network/Packet;]
	 * </p>
	 */
	public static McObfPair func_150911_c = McMappingDatabase.getSRG("ItemMap.func_150911_c");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_190907_h = McMappingDatabase.getSRG("ItemMap.func_190907_h");

	/**
	 * <p>
	 * Name: onCreated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_77622_d = McMappingDatabase.getSRG("ItemMap.func_77622_d");

}
