package zdoctor.zcoremod.map.minecraft.util.datafix.walkers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityTag {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tm";
		else
			return "net/minecraft/util/datafix/walkers/EntityTag";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tm";
		else
			return "EntityTag";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltm;";
		else
			return "Lnet/minecraft/util/datafix/walkers/EntityTag;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_188270_a = McMappingDatabase.getSRG("field_188270_a");

	/**
	 * <p>
	 * Name: process
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IDataFixer;Lnet/minecraft/nbt/NBTTagCompound;I)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188266_a = McMappingDatabase.getSRG("EntityTag.func_188266_a");

}
