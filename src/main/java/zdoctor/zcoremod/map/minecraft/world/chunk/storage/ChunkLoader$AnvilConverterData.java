package zdoctor.zcoremod.map.minecraft.world.chunk.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkLoader$AnvilConverterData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayi$a";
		else
			return "net/minecraft/world/chunk/storage/ChunkLoader$AnvilConverterData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayi$a";
		else
			return "ChunkLoader$AnvilConverterData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layi$a;";
		else
			return "Lnet/minecraft/world/chunk/storage/ChunkLoader$AnvilConverterData;";
	}

	/**
	 * <p>
	 * Name: tileEntities
	 * </p>
	 */
	public static McObfPair field_151564_i = McMappingDatabase.getSRG("field_151564_i");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_76692_f = McMappingDatabase.getSRG("field_76692_f");

	/**
	 * <p>
	 * Name: blockLight
	 * </p>
	 */
	public static McObfPair field_76694_d = McMappingDatabase.getSRG("field_76694_d");

	/**
	 * <p>
	 * Name: lastUpdated
	 * </p>
	 */
	public static McObfPair field_76698_a = McMappingDatabase.getSRG("field_76698_a");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_76699_l = McMappingDatabase.getSRG("field_76699_l");

	/**
	 * <p>
	 * Name: tileTicks
	 * </p>
	 */
	public static McObfPair field_151563_j = McMappingDatabase.getSRG("field_151563_j");

	/**
	 * <p>
	 * Name: blocks
	 * </p>
	 */
	public static McObfPair field_76693_g = McMappingDatabase.getSRG("field_76693_g");

	/**
	 * <p>
	 * Name: heightmap
	 * </p>
	 */
	public static McObfPair field_76697_c = McMappingDatabase.getSRG("field_76697_c");

	/**
	 * <p>
	 * Name: terrainPopulated
	 * </p>
	 */
	public static McObfPair field_76696_b = McMappingDatabase.getSRG("field_76696_b");

	/**
	 * <p>
	 * Name: entities
	 * </p>
	 */
	public static McObfPair field_76702_h = McMappingDatabase.getSRG("field_76702_h");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_76701_k = McMappingDatabase.getSRG("field_76701_k");

	/**
	 * <p>
	 * Name: skyLight
	 * </p>
	 */
	public static McObfPair field_76695_e = McMappingDatabase.getSRG("field_76695_e");

}
