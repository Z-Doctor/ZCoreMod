package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityNote {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avz";
		else
			return "net/minecraft/tileentity/TileEntityNote";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avz";
		else
			return "TileEntityNote";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavz;";
		else
			return "Lnet/minecraft/tileentity/TileEntityNote;";
	}

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityNote.func_145839_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityNote.func_189515_b");

	/**
	 * <p>
	 * Name: changePitch
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145877_a = McMappingDatabase.getSRG("TileEntityNote.func_145877_a");

	/**
	 * <p>
	 * Name: note
	 * </p>
	 */
	public static McObfPair field_145879_a = McMappingDatabase.getSRG("field_145879_a");

	/**
	 * <p>
	 * Name: triggerNote
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_175108_a = McMappingDatabase.getSRG("TileEntityNote.func_175108_a");

	/**
	 * <p>
	 * Name: previousRedstoneState
	 * </p>
	 */
	public static McObfPair field_145880_i = McMappingDatabase.getSRG("field_145880_i");

}
