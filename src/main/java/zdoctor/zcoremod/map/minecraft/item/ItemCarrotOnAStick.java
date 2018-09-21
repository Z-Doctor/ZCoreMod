package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemCarrotOnAStick {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahj";
		else
			return "net/minecraft/item/ItemCarrotOnAStick";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahj";
		else
			return "ItemCarrotOnAStick";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahj;";
		else
			return "Lnet/minecraft/item/ItemCarrotOnAStick;";
	}

	/**
	 * <p>
	 * Name: isFull3D
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77662_d = McMappingDatabase.getSRG("ItemCarrotOnAStick.func_77662_d");

	/**
	 * <p>
	 * Name: onItemRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;]
	 * </p>
	 */
	public static McObfPair func_77659_a = McMappingDatabase.getSRG("ItemCarrotOnAStick.func_77659_a");

	/**
	 * <p>
	 * Name: shouldRotateAroundWhenRendering
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77629_n_ = McMappingDatabase.getSRG("ItemCarrotOnAStick.func_77629_n_");

}
