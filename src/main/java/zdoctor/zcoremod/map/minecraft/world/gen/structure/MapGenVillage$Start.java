package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenVillage$Start {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bca$a";
		else
			return "net/minecraft/world/gen/structure/MapGenVillage$Start";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bca$a";
		else
			return "MapGenVillage$Start";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbca$a;";
		else
			return "Lnet/minecraft/world/gen/structure/MapGenVillage$Start;";
	}

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143017_b = McMappingDatabase.getSRG("MapGenVillage$Start.func_143017_b");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143022_a = McMappingDatabase.getSRG("MapGenVillage$Start.func_143022_a");

	/**
	 * <p>
	 * Name: hasMoreThanTwoComponents
	 * </p>
	 */
	public static McObfPair field_75076_c = McMappingDatabase.getSRG("field_75076_c");

	/**
	 * <p>
	 * Name: isSizeableStructure
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75069_d = McMappingDatabase.getSRG("MapGenVillage$Start.func_75069_d");

}
