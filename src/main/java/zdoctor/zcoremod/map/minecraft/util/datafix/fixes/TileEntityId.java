package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityId {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sd";
		else
			return "net/minecraft/util/datafix/fixes/TileEntityId";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sd";
		else
			return "TileEntityId";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lsd;";
		else
			return "Lnet/minecraft/util/datafix/fixes/TileEntityId;";
	}

	/**
	 * <p>
	 * Name: getFixVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188216_a = McMappingDatabase.getSRG("TileEntityId.func_188216_a");

	/**
	 * <p>
	 * Name: OLD_TO_NEW_ID_MAP
	 * </p>
	 */
	public static McObfPair field_191275_a = McMappingDatabase.getSRG("field_191275_a");

	/**
	 * <p>
	 * Name: fixTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188217_a = McMappingDatabase.getSRG("TileEntityId.func_188217_a");

}
