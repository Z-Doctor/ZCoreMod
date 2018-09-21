package zdoctor.zcoremod.map.minecraft.client.player.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LocalBlockIntercommunication {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bug";
		else
			return "net/minecraft/client/player/inventory/LocalBlockIntercommunication";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bug";
		else
			return "LocalBlockIntercommunication";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbug;";
		else
			return "Lnet/minecraft/client/player/inventory/LocalBlockIntercommunication;";
	}

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145818_k_ = McMappingDatabase.getSRG("LocalBlockIntercommunication.func_145818_k_");

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("LocalBlockIntercommunication.func_174875_k");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("LocalBlockIntercommunication.func_145748_c_");

	/**
	 * <p>
	 * Name: guiID
	 * </p>
	 */
	public static McObfPair field_175126_a = McMappingDatabase.getSRG("field_175126_a");

	/**
	 * <p>
	 * Name: displayName
	 * </p>
	 */
	public static McObfPair field_175125_b = McMappingDatabase.getSRG("field_175125_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("LocalBlockIntercommunication.func_70005_c_");

	/**
	 * <p>
	 * Name: createContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Container;]
	 * </p>
	 */
	public static McObfPair func_174876_a = McMappingDatabase.getSRG("LocalBlockIntercommunication.func_174876_a");

}
