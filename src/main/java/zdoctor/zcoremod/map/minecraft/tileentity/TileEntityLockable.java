package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityLockable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avx";
		else
			return "net/minecraft/tileentity/TileEntityLockable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avx";
		else
			return "TileEntityLockable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavx;";
		else
			return "Lnet/minecraft/tileentity/TileEntityLockable;";
	}

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityLockable.func_189515_b");

	/**
	 * <p>
	 * Name: code
	 * </p>
	 */
	public static McObfPair field_174901_a = McMappingDatabase.getSRG("field_174901_a");

	/**
	 * <p>
	 * Name: isLocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174893_q_ = McMappingDatabase.getSRG("TileEntityLockable.func_174893_q_");

	/**
	 * <p>
	 * Name: getLockCode
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/LockCode;]
	 * </p>
	 */
	public static McObfPair func_174891_i = McMappingDatabase.getSRG("TileEntityLockable.func_174891_i");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityLockable.func_145839_a");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("TileEntityLockable.func_145748_c_");

	/**
	 * <p>
	 * Name: setLockCode
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/LockCode;)V]
	 * </p>
	 */
	public static McObfPair func_174892_a = McMappingDatabase.getSRG("TileEntityLockable.func_174892_a");

}
