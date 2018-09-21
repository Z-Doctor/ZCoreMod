package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityComparator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avn";
		else
			return "net/minecraft/tileentity/TileEntityComparator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avn";
		else
			return "TileEntityComparator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavn;";
		else
			return "Lnet/minecraft/tileentity/TileEntityComparator;";
	}

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityComparator.func_145839_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityComparator.func_189515_b");

	/**
	 * <p>
	 * Name: outputSignal
	 * </p>
	 */
	public static McObfPair field_145997_a = McMappingDatabase.getSRG("field_145997_a");

	/**
	 * <p>
	 * Name: setOutputSignal
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_145995_a = McMappingDatabase.getSRG("TileEntityComparator.func_145995_a");

	/**
	 * <p>
	 * Name: getOutputSignal
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_145996_a = McMappingDatabase.getSRG("TileEntityComparator.func_145996_a");

}
