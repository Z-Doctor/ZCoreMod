package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityEnderChest {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avs";
		else
			return "net/minecraft/tileentity/TileEntityEnderChest";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avs";
		else
			return "TileEntityEnderChest";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavs;";
		else
			return "Lnet/minecraft/tileentity/TileEntityEnderChest;";
	}

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("TileEntityEnderChest.func_73660_a");

	/**
	 * <p>
	 * Name: receiveClientEvent
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_145842_c = McMappingDatabase.getSRG("TileEntityEnderChest.func_145842_c");

	/**
	 * <p>
	 * Name: numPlayersUsing
	 * </p>
	 */
	public static McObfPair field_145973_j = McMappingDatabase.getSRG("field_145973_j");

	/**
	 * <p>
	 * Name: invalidate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145843_s = McMappingDatabase.getSRG("TileEntityEnderChest.func_145843_s");

	/**
	 * <p>
	 * Name: prevLidAngle
	 * </p>
	 */
	public static McObfPair field_145975_i = McMappingDatabase.getSRG("field_145975_i");

	/**
	 * <p>
	 * Name: openChest
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145969_a = McMappingDatabase.getSRG("TileEntityEnderChest.func_145969_a");

	/**
	 * <p>
	 * Name: ticksSinceSync
	 * </p>
	 */
	public static McObfPair field_145974_k = McMappingDatabase.getSRG("field_145974_k");

	/**
	 * <p>
	 * Name: canBeUsed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_145971_a = McMappingDatabase.getSRG("TileEntityEnderChest.func_145971_a");

	/**
	 * <p>
	 * Name: closeChest
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145970_b = McMappingDatabase.getSRG("TileEntityEnderChest.func_145970_b");

	/**
	 * <p>
	 * Name: lidAngle
	 * </p>
	 */
	public static McObfPair field_145972_a = McMappingDatabase.getSRG("field_145972_a");

}
