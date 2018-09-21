package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockJukebox$TileEntityJukebox {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arp$a";
		else
			return "net/minecraft/block/BlockJukebox$TileEntityJukebox";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arp$a";
		else
			return "BlockJukebox$TileEntityJukebox";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Larp$a;";
		else
			return "Lnet/minecraft/block/BlockJukebox$TileEntityJukebox;";
	}

	/**
	 * <p>
	 * Name: record
	 * </p>
	 */
	public static McObfPair field_145858_a = McMappingDatabase.getSRG("field_145858_a");

	/**
	 * <p>
	 * Name: getRecord
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_145856_a = McMappingDatabase.getSRG("BlockJukebox$TileEntityJukebox.func_145856_a");

	/**
	 * <p>
	 * Name: setRecord
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_145857_a = McMappingDatabase.getSRG("BlockJukebox$TileEntityJukebox.func_145857_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("BlockJukebox$TileEntityJukebox.func_189515_b");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("BlockJukebox$TileEntityJukebox.func_145839_a");

}
