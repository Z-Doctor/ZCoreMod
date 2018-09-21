package zdoctor.zcoremod.map.minecraft.client.settings;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class HotbarSnapshot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buf";
		else
			return "net/minecraft/client/settings/HotbarSnapshot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buf";
		else
			return "HotbarSnapshot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuf;";
		else
			return "Lnet/minecraft/client/settings/HotbarSnapshot;";
	}

	/**
	 * <p>
	 * Name: createTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_192834_a = McMappingDatabase.getSRG("HotbarSnapshot.func_192834_a");

	/**
	 * <p>
	 * Name: HOTBAR_SIZE
	 * </p>
	 */
	public static McObfPair field_192835_a = McMappingDatabase.getSRG("field_192835_a");

	/**
	 * <p>
	 * Name: fromTag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagList;)V]
	 * </p>
	 */
	public static McObfPair func_192833_a = McMappingDatabase.getSRG("HotbarSnapshot.func_192833_a");

}
