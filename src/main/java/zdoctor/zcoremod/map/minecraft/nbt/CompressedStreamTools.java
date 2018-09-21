package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CompressedStreamTools {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gi";
		else
			return "net/minecraft/nbt/CompressedStreamTools";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gi";
		else
			return "CompressedStreamTools";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgi;";
		else
			return "Lnet/minecraft/nbt/CompressedStreamTools;";
	}

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_74800_a = McMappingDatabase.getSRG("CompressedStreamTools.func_74800_a");

	/**
	 * <p>
	 * Name: writeTag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTBase;Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_150663_a = McMappingDatabase.getSRG("CompressedStreamTools.func_150663_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInputStream;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_74794_a = McMappingDatabase.getSRG("CompressedStreamTools.func_74794_a");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Ljava/io/File;)V]
	 * </p>
	 */
	public static McObfPair func_74795_b = McMappingDatabase.getSRG("CompressedStreamTools.func_74795_b");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;ILnet/minecraft/nbt/NBTSizeTracker;)Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_152455_a = McMappingDatabase.getSRG("CompressedStreamTools.func_152455_a");

	/**
	 * <p>
	 * Name: writeCompressed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Ljava/io/OutputStream;)V]
	 * </p>
	 */
	public static McObfPair func_74799_a = McMappingDatabase.getSRG("CompressedStreamTools.func_74799_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;Lnet/minecraft/nbt/NBTSizeTracker;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_152456_a = McMappingDatabase.getSRG("CompressedStreamTools.func_152456_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_74797_a = McMappingDatabase.getSRG("CompressedStreamTools.func_74797_a");

	/**
	 * <p>
	 * Name: safeWrite
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Ljava/io/File;)V]
	 * </p>
	 */
	public static McObfPair func_74793_a = McMappingDatabase.getSRG("CompressedStreamTools.func_74793_a");

	/**
	 * <p>
	 * Name: readCompressed
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/InputStream;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_74796_a = McMappingDatabase.getSRG("CompressedStreamTools.func_74796_a");

}
