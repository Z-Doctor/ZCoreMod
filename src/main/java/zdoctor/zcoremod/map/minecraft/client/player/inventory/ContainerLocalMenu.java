package zdoctor.zcoremod.map.minecraft.client.player.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ContainerLocalMenu {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buh";
		else
			return "net/minecraft/client/player/inventory/ContainerLocalMenu";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buh";
		else
			return "ContainerLocalMenu";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuh;";
		else
			return "Lnet/minecraft/client/player/inventory/ContainerLocalMenu;";
	}

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("ContainerLocalMenu.func_174875_k");

	/**
	 * <p>
	 * Name: isLocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174893_q_ = McMappingDatabase.getSRG("ContainerLocalMenu.func_174893_q_");

	/**
	 * <p>
	 * Name: guiID
	 * </p>
	 */
	public static McObfPair field_174896_a = McMappingDatabase.getSRG("field_174896_a");

	/**
	 * <p>
	 * Name: getLockCode
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/LockCode;]
	 * </p>
	 */
	public static McObfPair func_174891_i = McMappingDatabase.getSRG("ContainerLocalMenu.func_174891_i");

	/**
	 * <p>
	 * Name: dataValues
	 * </p>
	 */
	public static McObfPair field_174895_b = McMappingDatabase.getSRG("field_174895_b");

	/**
	 * <p>
	 * Name: setLockCode
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/LockCode;)V]
	 * </p>
	 */
	public static McObfPair func_174892_a = McMappingDatabase.getSRG("ContainerLocalMenu.func_174892_a");

	/**
	 * <p>
	 * Name: createContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Container;]
	 * </p>
	 */
	public static McObfPair func_174876_a = McMappingDatabase.getSRG("ContainerLocalMenu.func_174876_a");

	/**
	 * <p>
	 * Name: getFieldCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_174890_g = McMappingDatabase.getSRG("ContainerLocalMenu.func_174890_g");

	/**
	 * <p>
	 * Name: getField
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_174887_a_ = McMappingDatabase.getSRG("ContainerLocalMenu.func_174887_a_");

	/**
	 * <p>
	 * Name: setField
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_174885_b = McMappingDatabase.getSRG("ContainerLocalMenu.func_174885_b");

}
