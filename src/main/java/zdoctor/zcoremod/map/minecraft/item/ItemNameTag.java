package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemNameTag {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aja";
		else
			return "net/minecraft/item/ItemNameTag";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aja";
		else
			return "ItemNameTag";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laja;";
		else
			return "Lnet/minecraft/item/ItemNameTag;";
	}

	/**
	 * <p>
	 * Name: itemInteractionForEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_111207_a = McMappingDatabase.getSRG("ItemNameTag.func_111207_a");

}
