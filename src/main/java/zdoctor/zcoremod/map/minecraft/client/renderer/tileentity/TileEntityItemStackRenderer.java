package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityItemStackRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buo";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityItemStackRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buo";
		else
			return "TileEntityItemStackRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuo;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityItemStackRenderer;";
	}

	/**
	 * <p>
	 * Name: modelShield
	 * </p>
	 */
	public static McObfPair field_187318_g = McMappingDatabase.getSRG("field_187318_g");

	/**
	 * <p>
	 * Name: renderByItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_179022_a = McMappingDatabase.getSRG("TileEntityItemStackRenderer.func_179022_a");

	/**
	 * <p>
	 * Name: SHULKER_BOXES
	 * </p>
	 */
	public static McObfPair field_191274_b = McMappingDatabase.getSRG("field_191274_b");

	/**
	 * <p>
	 * Name: renderByItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;F)V]
	 * </p>
	 */
	public static McObfPair func_192838_a = McMappingDatabase.getSRG("TileEntityItemStackRenderer.func_192838_a");

	/**
	 * <p>
	 * Name: chestTrap
	 * </p>
	 */
	public static McObfPair field_147718_c = McMappingDatabase.getSRG("field_147718_c");

	/**
	 * <p>
	 * Name: enderChest
	 * </p>
	 */
	public static McObfPair field_147716_d = McMappingDatabase.getSRG("field_147716_d");

	/**
	 * <p>
	 * Name: skull
	 * </p>
	 */
	public static McObfPair field_179023_f = McMappingDatabase.getSRG("field_179023_f");

	/**
	 * <p>
	 * Name: banner
	 * </p>
	 */
	public static McObfPair field_179024_e = McMappingDatabase.getSRG("field_179024_e");

	/**
	 * <p>
	 * Name: bed
	 * </p>
	 */
	public static McObfPair field_193843_g = McMappingDatabase.getSRG("field_193843_g");

	/**
	 * <p>
	 * Name: chestBasic
	 * </p>
	 */
	public static McObfPair field_147717_b = McMappingDatabase.getSRG("field_147717_b");

	/**
	 * <p>
	 * Name: instance
	 * </p>
	 */
	public static McObfPair field_147719_a = McMappingDatabase.getSRG("field_147719_a");

}
