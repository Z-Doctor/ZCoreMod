package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenStructureData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbw";
		else
			return "net/minecraft/world/gen/structure/MapGenStructureData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbw";
		else
			return "MapGenStructureData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbw;";
		else
			return "Lnet/minecraft/world/gen/structure/MapGenStructureData;";
	}

	/**
	 * <p>
	 * Name: getTagCompound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_143041_a = McMappingDatabase.getSRG("MapGenStructureData.func_143041_a");

	/**
	 * <p>
	 * Name: formatChunkCoords
	 * </p>
	 * <p>
	 * Desc: [(II)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_143042_b = McMappingDatabase.getSRG("MapGenStructureData.func_143042_b");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_76184_a = McMappingDatabase.getSRG("MapGenStructureData.func_76184_a");

	/**
	 * <p>
	 * Name: tagCompound
	 * </p>
	 */
	public static McObfPair field_143044_a = McMappingDatabase.getSRG("field_143044_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189551_b = McMappingDatabase.getSRG("MapGenStructureData.func_189551_b");

	/**
	 * <p>
	 * Name: writeInstance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;II)V]
	 * </p>
	 */
	public static McObfPair func_143043_a = McMappingDatabase.getSRG("MapGenStructureData.func_143043_a");

}
