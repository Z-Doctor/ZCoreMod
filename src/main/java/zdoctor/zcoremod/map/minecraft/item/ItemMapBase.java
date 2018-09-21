package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemMapBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aho";
		else
			return "net/minecraft/item/ItemMapBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aho";
		else
			return "ItemMapBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laho;";
		else
			return "Lnet/minecraft/item/ItemMapBase;";
	}

	/**
	 * <p>
	 * Name: isMap
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77643_m_ = McMappingDatabase.getSRG("ItemMapBase.func_77643_m_");

	/**
	 * <p>
	 * Name: createMapDataPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/network/Packet;]
	 * </p>
	 */
	public static McObfPair func_150911_c = McMappingDatabase.getSRG("ItemMapBase.func_150911_c");

}
