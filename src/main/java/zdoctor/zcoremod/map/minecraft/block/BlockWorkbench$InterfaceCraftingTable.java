package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockWorkbench$InterfaceCraftingTable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apr$a";
		else
			return "net/minecraft/block/BlockWorkbench$InterfaceCraftingTable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apr$a";
		else
			return "BlockWorkbench$InterfaceCraftingTable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lapr$a;";
		else
			return "Lnet/minecraft/block/BlockWorkbench$InterfaceCraftingTable;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("BlockWorkbench$InterfaceCraftingTable.func_70005_c_");

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145818_k_ = McMappingDatabase.getSRG("BlockWorkbench$InterfaceCraftingTable.func_145818_k_");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("BlockWorkbench$InterfaceCraftingTable.func_145748_c_");

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_175127_b = McMappingDatabase.getSRG("field_175127_b");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_175128_a = McMappingDatabase.getSRG("field_175128_a");

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("BlockWorkbench$InterfaceCraftingTable.func_174875_k");

	/**
	 * <p>
	 * Name: createContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Container;]
	 * </p>
	 */
	public static McObfPair func_174876_a = McMappingDatabase.getSRG("BlockWorkbench$InterfaceCraftingTable.func_174876_a");

}
